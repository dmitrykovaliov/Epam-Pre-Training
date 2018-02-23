package task6.util;

import java.util.Arrays;
import java.util.Objects;

/* push(): метод добавляет элемент в конец стека, который называется его
вершиной;
 pop(): метод удаляет с одновременным возвратом удаляемого элемента
из вершины стека, если стек непустой;
 peek(): метод возвращает элемент из вершины стека, если стек не пу-
стой; метод не должен удалять элемент из стека;
 size(): метод возвращает общее количество элементов в стеке.
 isEmpty(): метод возвращает булевское значение true, если стек является
пустым, в противном случае метод должен возвращать false;
 isFull(): метод возвращает булевское значение true, если стек полностью
заполнен, в противном случае метод должен возвращать false*/


public class MyStack<T> extends UniStackArray<T> {

    private static int STEP = 10;

    private T[] array;
    private int cursor = 0; //the position to add item
    private int n = STEP; //initial array
    private boolean dynamicOption = false;

    public MyStack() {
        array = (T[]) new Object[n];
        dynamicOption = true;
    }


    public MyStack(int n) {
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
        MyStack arList = (MyStack) o;
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

    @Override
    public void push(T o) {

        array[cursor] = o;
        cursor++;

        if (dynamicOption && cursor == n) {
            n += STEP;
            copy(array);
        }
    }


    @Override
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

    @Override
    public T peek() {

        T peakElement = null;

        if (cursor > 0) {
            peakElement = (T) array[cursor - 1];
            return peakElement;
        }

        return peakElement;

    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
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
