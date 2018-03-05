package task6.util.array;

import task6.exception.EmptySetException;
import task6.exception.OutIndexException;

public interface UniList<T> {

   void add(T o) throws OutIndexException;

    void remove(int i) throws EmptySetException, OutIndexException;

    T get(int i) throws EmptySetException, OutIndexException;

    int size();

}
