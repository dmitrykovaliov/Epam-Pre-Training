package task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryTree <T extends Comparable> implements UniTree<T> {
    Node<T> root;
    private int count = 0;

    public BinaryTree() {
        this.root = null;
    }

    public class Node<T extends Comparable> {
        T data;
        Node leftNode;
        Node rightNode;

        public Node(T data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

    }

    //contains item
    public boolean contains(T item) throws EmptyTreeException {

        if(count == 0 ) throw new EmptyTreeException("The tree is empty");

        return contains(root, item);
    }

    private boolean contains(Node node, T item) {

        if (node == null) {
            return false;
        }

        if (item == node.data) {
            return true;
        }

        if (item.compareTo(node.data) < 0) {
            return contains(node.leftNode, item);
        } else {
            return contains(node.rightNode, item);
        }
    }

    //add item
    public void add(T item) {
        root = addNode(root, item);
    }

    private Node addNode(Node node, T item) {

        if (node == null) {
            node = new Node(item);
            count++;
        } else {
            if (item.compareTo(node.data) < 0) {
                node.leftNode = addNode(node.leftNode, item);
            }
            else{
                node.rightNode = addNode(node.rightNode, item);
            }
        }

        return node;
    }

    //clear all elements
    public void clear() {
        deleteAll(root);
    }

    private Node deleteAll(Node node) {
        if (node == null) {
            return null;
        }
        node.leftNode = deleteAll(node.leftNode);
        node.rightNode = deleteAll(node.rightNode);
        node.data = null;
        count--;
        return node;
    }

    //delete nodes
    public void delete(T item) {
        deleteNode(root, item);
    }

    private Node deleteNode(Node node, T item) {

        if (node == null) {
            return null;
        }

        if (item == node.data) {

            //no children
            if (node.leftNode == null && node.rightNode == null) {
                count--;
                return null;
            }

            //one child
            if (node.rightNode == null) {
                count--;
                return node.leftNode;
            }

            if (node.leftNode == null) {
                count--;
                return node.rightNode;
            }

            //two children
            T minValue = findMin(node.rightNode);
            node.data = minValue;
            node.rightNode = deleteNode(node.rightNode, minValue);
            return node;

        }

        if (item.compareTo(node.data) < 0) {
            node.leftNode = deleteNode(node.leftNode, item);
            return node;
        } else {
            node.rightNode = deleteNode(node.rightNode, item);
            return node;
        }
    }

    //additional to deleteNode method
    private T findMin(Node node) {
        return node.leftNode == null ? (T)node.data :
                findMin(node.leftNode);
    }





    //return size of tree
    public int size() {
        return count;
    }

    @Override
    public List preOrderTree() throws EmptyTreeException {
        if(count == 0) {
            throw new EmptyTreeException("The tree is empty");
        }
       return preOrderTree(root, new ArrayList());
    }

    @Override
    public List postOrderTree() throws EmptyTreeException {
        if(count == 0) {
            throw new EmptyTreeException("The tree is empty");
        }
        return postOrderTree(root, new ArrayList());
    }

    @Override
    public List inOrderTree() throws EmptyTreeException {
        if(count == 0) {
            throw new EmptyTreeException("The tree is empty");
        }
        return inOrderTree(root, new ArrayList());
    }

    private List preOrderTree(Node top, List list) {
        if (top != null) {
            list.add(top.data);
            preOrderTree(top.leftNode, list);
            preOrderTree(top.rightNode, list);
        }
        return list;
    }

    private List postOrderTree(Node top, List list) {
        if (top != null) {
            postOrderTree(top.leftNode, list);
            postOrderTree(top.rightNode, list);
            list.add(top.data);
        }
        return list;
    }

    private List inOrderTree(Node top, List list) {
        if (top != null) {
            inOrderTree(top.leftNode, list);
            list.add(top.data);
            inOrderTree(top.rightNode, list);
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryTree)) return false;
        BinaryTree<?> that = (BinaryTree<?>) o;
        return count == that.count &&
                Objects.equals(root, that.root);
    }

    @Override
    public int hashCode() {

        return Objects.hash(root, count);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                ", count=" + count +
                '}';
    }
}
