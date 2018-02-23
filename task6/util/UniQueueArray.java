package task6.util;

public abstract class UniQueueArray<T> extends UniArray<T> {

    public abstract void enqueue(T o);

    public abstract T dequeue();
}
