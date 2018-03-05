package task6.util.array;

import task6.exception.EmptySetException;
import task6.exception.IllegalSizeException;
import task6.exception.OutIndexException;

import java.util.Arrays;
import java.util.Objects;

public class ArList<T> implements UniList<T> {

    protected static int STEP = 10;

    protected T[] array;
    protected int cursor = 0; //the position to add item
    protected int n = STEP; //initial array
    protected boolean dynamicOption; //dynamic option can be added if entered the size of array

    //constructors for dynamic option
    public ArList() {
        array = (T[]) new Object[n];
        dynamicOption = true;
    }

    public ArList(T... o) {
        n = (STEP - o.length % STEP) + o.length; // to make relevant to step
        array = (T[]) new Object[o.length];
        for (int i = 0; i < o.length; i++) {
            array[i] = o[i];
        }
        dynamicOption = true;
    }

    //constructor for fixed option
    public ArList(int n) throws IllegalSizeException {

        if(n > 0) {
            this.n = n;
            array = (T[]) new Object[n];
        } else {
            throw new IllegalSizeException("Please check entered size of array");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArList arList = (ArList) o;
        return cursor == arList.cursor &&
                Arrays.equals(array, arList.array);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(cursor);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }


    @Override
    public void add(T o) throws OutIndexException {

        array[cursor] = o;
        cursor++;

        if (dynamicOption && cursor == n) {
            n += STEP;
            copy(array);
        }

        if (cursor > array.length) {
            throw new OutIndexException("Out of array");
        }
    }

    @Override
    public void remove(int j) throws OutIndexException {

        if (j >= 0 && j < cursor) {

            for (int i = j; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }

            array[cursor - 1] = null;
            cursor--;

            if (dynamicOption && n - cursor > STEP) {
                n -= STEP;
                copy(array);
            }
        } else {
            throw new OutIndexException("Out of array");
        }
    }

    public T get(int i) throws OutIndexException {
        if (i >= 0 && i < cursor) {
            return array[i];
        }  else {
            throw new OutIndexException("Out of array");
        }
    }

    public void clear() throws EmptySetException {
        if(cursor == 0) {
            throw new EmptySetException("The collection is empty");
        }
        n = STEP;
        cursor = 0;
        array = (T[]) new Object[n];
    }

    public int size() {
        return cursor;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return !dynamicOption && n == cursor;
    }

    protected void copy(T[] ar) {
        T[] ar1 = (T[])new Object[n];

        for (int i = 0; i < cursor; i++) {
            ar1[i] = ar[i];
        }
        array = ar1;
    }

    public boolean contains(Object o) {
        boolean isContains = false;
        if (o == null) {
            for (int i = 0; i < cursor; i++)
                if (array[i]==null)
                    isContains = true;
        } else {
            for (int i = 0; i < cursor; i++)
                if (o.equals(array[i]))
                    isContains = true;
        }
        return isContains;
    }


}
