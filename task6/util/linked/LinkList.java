package task6.util.linked;

import task6.exception.EmptySetException;

public class LinkList<T>  {

    protected Node top;
    protected int size;

    public LinkList(){
        top=null;
        size=0;
    }

    class Node {
        private T item;
        private Node next;

        public Node(){
        }

        public Node(T item, Node next){
            this.next=next;
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public T peak() throws EmptySetException {
        if(isEmpty()){
            throw new EmptySetException("Empty stack");
        }
        return top.getItem();
    }


}
