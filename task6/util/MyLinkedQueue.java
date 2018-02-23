package task6.util;


import java.util.LinkedList;
import java.util.Objects;

public class MyLinkedQueue<T> extends UniQueueArray<T> {

    private LinkedList<T> linkedList;

    public MyLinkedQueue() {
        linkedList = new LinkedList<>();
    }

    public MyLinkedQueue(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyLinkedQueue)) return false;
        MyLinkedQueue<?> that = (MyLinkedQueue<?>) o;
        return Objects.equals(linkedList, that.linkedList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(linkedList);
    }

    @Override
    public String toString() {
        return "MyLinkedQueue{" +
                "linkedList=" + linkedList +
                '}';
    }

    public void enqueue(T o) {
        linkedList.addLast(o);
    }

    public T dequeue() {
        if (linkedList.size() > 0) {
            return linkedList.removeFirst();
        }
        return null;
    }

    public T peek() {
        if (linkedList.size() > 0) {
            return linkedList.peek();
        }
        return null;
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }


}
