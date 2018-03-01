package task7;

public class BinaryTree <T extends Comparable> {
    Node<T> root;
    private int count = 0;

    public BinaryTree() {
        this.root = null;
    }

    //contains item
    public boolean contains(T item) {

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
            if(item.compareTo(node.data) == 0) {
                return node;
            }
            if (item.compareTo(node.data) < 0)
                node.leftNode = addNode(node.leftNode, item);
            else
                node.rightNode = addNode(node.rightNode, item);
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

    //return size of tree
    public int size() {
        return count;
    }

    //additional to deleteNode method
    private T findMin(Node node) {
        return node.leftNode == null ? (T)node.data :
                findMin(node.leftNode);
    }

}
