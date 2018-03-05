package task6.util.array;

import task6.exception.IllegalSizeException;

public class ArListQueue<T> extends ArList<T> {

    public ArListQueue() {
    }

    public ArListQueue(int n) throws IllegalSizeException {
        super(n);
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
            firstElement = array[0];

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
            peakElement = array[0];
            return peakElement;
        }

        return peakElement;
    }




}
