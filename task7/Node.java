package task7;

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
