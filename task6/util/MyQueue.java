package task6.util;


import java.util.Arrays;
import java.util.Objects;

public class MyQueue<T> extends UniQueueArray<T> {
    private static int STEP = 10;

    private T[] array;
    private int cursor = 0; //the position to add item
    private int n = STEP; //initial array
    private boolean dynamicOption = false;

    public MyQueue() {
        array = (T[]) new Object[n];
        dynamicOption = true;
    }

    public MyQueue(int n) {
        this.n = n;
        array = (T[]) new Object[n];
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(cursor);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyQueue arList = (MyQueue) o;
        return cursor == arList.cursor &&
                Arrays.equals(array, arList.array);
    }

    @Override
    public String toString() {
        if (cursor > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < cursor; i++) {
                if (i == 0) {
                    stringBuilder.append("[" + array[i] + ", ");
                } else if (i < cursor - 1)
                    stringBuilder.append(array[i] + ", ");
                else {
                    stringBuilder.append(array[i] + "]");
                }
            }
            return stringBuilder.toString();
        } else {
            return "[]";
        }
    }

    public void enqueue(T o) {

        array[cursor] = o;
        cursor++;

        if (dynamicOption && cursor == n) {
            n += STEP;
            copy(array);
        }
    }


    public T dequeue() {

        T firstElement = null;

        if (cursor > 0) {
            firstElement = (T) array[0];

            for (int i = 0; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }

            array[cursor - 1] = null;
            cursor--;

            if (dynamicOption && n - cursor > STEP) {
                n -= STEP;
                copy(array);
            }

            return firstElement;
        }

        return firstElement;
    }

    public T peek() {

        T peakElement = null;

        if (cursor > 0) {
            peakElement = (T) array[0];
            return peakElement;
        }

        return peakElement;
    }

    public int size() {
        return cursor;
    }

    public boolean isEmpty() {
        return cursor == 0;
    }

    public boolean isFull() {
        return !dynamicOption && n == cursor;
    }

    private void copy(T[] ar) {
        T[] ar1 = (T[]) new Object[n];

        for (int i = 0; i < cursor; i++) {
            ar1[i] = ar[i];
        }
        array = ar1;
    }
}
