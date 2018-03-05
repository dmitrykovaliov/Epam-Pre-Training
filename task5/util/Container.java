package task5.util;

import task6.exception.EmptySetException;
import task6.exception.OutIndexException;
import task6.util.array.ArList;
import task6.util.array.UniList;

public class Container<T> implements UniList<T> {

    private UniList<T> uniList;

    public Container() {
        this.uniList = new ArList<>();
    }

    @Override
    public void add(T o) throws OutIndexException {
        uniList.add(o);
    }

    @Override
    public void remove(int i) throws EmptySetException, OutIndexException {
        uniList.remove(i);
    }

    @Override
    public T get(int i) throws EmptySetException, OutIndexException {
        return uniList.get(i);
    }

    @Override
    public int size() {
        return uniList.size();
    }

    @Override
    public int hashCode() {
        return uniList.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return uniList.equals(obj);
    }

    @Override
    public String toString() {
        return uniList.toString();
    }
}
