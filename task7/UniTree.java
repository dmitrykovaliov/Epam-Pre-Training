package task7;


import java.util.List;

interface UniTree<T> {

    void add(T o);
    void delete(T item);
    boolean contains(T item) throws EmptyTreeException;
    int size();
    List preOrderTree() throws EmptyTreeException;
    List postOrderTree() throws EmptyTreeException;
    List inOrderTree() throws EmptyTreeException;

}
