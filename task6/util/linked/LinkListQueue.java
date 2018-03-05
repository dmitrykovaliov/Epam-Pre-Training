package task6.util.linked;

import task6.exception.EmptySetException;

public class LinkListQueue<T> extends LinkList<T> {

    private Node last;

    public LinkListQueue() {
        top = null;
        last = null;
        size = 0;
    }

    public void enqueue(T obj) {
        Node nodeBeforeLast = last;
        last = new Node();
        last.setItem(obj);
        last.setNext(null);

        if (isEmpty()) {
            top = last;
        } else {
            nodeBeforeLast.setNext(last);
        }

        size++;

    }

    public T dequeue() throws EmptySetException {

        if (isEmpty()) {
            throw new EmptySetException("Empty queue");
        }
        T obj = top.getItem();
        top = top.getNext();
        size--;
        return obj;
    }
}
