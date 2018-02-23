package task6.util;

public class StackContainer <T> extends UniStackArray<T> {

    UniStackArray<T> uniStackArray;

    public StackContainer() {
        this.uniStackArray = new MyStack<>();
    }

    @Override
    public void push(T o) {
        uniStackArray.push(o);
    }

    @Override
    public T pop() {
        return uniStackArray.pop();
    }

    @Override
    public T peek() {
        return uniStackArray.peek();
    }

    @Override
    public int size() {
        return uniStackArray.size();
    }

    @Override
    public boolean isEmpty() {
        return uniStackArray.isEmpty();
    }
}
