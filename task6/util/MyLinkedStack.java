package task6.util;

import java.util.LinkedList;
import java.util.Objects;

public class MyLinkedStack<T> extends UniStackArray<T> {
    private LinkedList<T> linkedList;

    public MyLinkedStack() {
        linkedList = new LinkedList<>();
    }

    public MyLinkedStack(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyLinkedStack)) return false;
        MyLinkedStack<?> that = (MyLinkedStack<?>) o;
        return Objects.equals(linkedList, that.linkedList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(linkedList);
    }

    @Override
    public String toString() {
        return "MyLinkedStack{" +
                "linkedList=" + linkedList +
                '}';
    }

    public void push(T o) {
        linkedList.push(o);
    }

    public T pop() {
        if (linkedList.size() > 0) {
            return linkedList.pop();
        }
        return null;
    }

    public T peek() {
        if (linkedList.size() > 0) {
            return linkedList.getFirst();
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
