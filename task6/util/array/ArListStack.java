package task6.util.array;

import task6.exception.IllegalSizeException;
import task6.exception.OutIndexException;

public class ArListStack<T> extends ArList<T> {

    public ArListStack() {
    }

    public ArListStack(int n) throws IllegalSizeException {
        super(n);
    }

    public void push(T o) throws OutIndexException {

        super.add(o);
    }


    public T pop() {

        T peakElement = null;

        if (cursor > 0) {
            peakElement = (T) array[cursor - 1];

            array[cursor - 1] = null;
            cursor--;

            if (dynamicOption && n - cursor > STEP) {
                n -= STEP;
                copy(array);
            }

            return peakElement;
        }

        return peakElement;
    }


    public T peek() {

        T peakElement = null;

        if (cursor > 0) {
            peakElement = array[cursor - 1];
            return peakElement;
        }

        return peakElement;

    }

}
