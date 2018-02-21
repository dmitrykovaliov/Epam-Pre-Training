package task5.util;

import java.util.Arrays;
import java.util.Objects;

public class ArList<T> implements Container<T> {

    private static int STEP = 10;

    private T[] array;
    private int cursor = 0; //the position to add item
    private int n = STEP; //initial array

    public ArList() {
        array = (T[]) new Object[n];
    }

    public ArList(T... o) {
        n = (STEP - o.length % STEP) + o.length; // to make relevant to step
        array = (T[]) new Object[o.length];
        for (int i = 0; i < o.length; i++) {
            array[i] = o[i];
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
    public void add(T o) {

        array[cursor] = o;
        cursor++;

        if (cursor == n) {
            n += STEP;
            copy(array);
        }
    }

    @Override
    public void remove(int j) {

        if (j >= 0 && j < cursor) {

            for (int i = j; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }

            array[cursor - 1] = null;
            cursor--;

            if (n - cursor > STEP) {
                n -= STEP;
                copy(array);
            }
        } else {
            String str = "Last index: " + String.valueOf(cursor - 1);
            throw new IndexOutOfBoundsException(str);
        }
    }

    public T get(int i) {
        if (i >= 0 && i < cursor) {
            return array[i];
        }  else {
            String str = "Last index: " + String.valueOf(cursor - 1);
            throw new IndexOutOfBoundsException(str);
        }
    }

    public void clear() {
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

    private void copy(T[] ar) {
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
