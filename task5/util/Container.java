package task5.util;

public interface Container<T> {
    void add(T o);
    void remove(int i);
    T get(int i);
    int size();
}
