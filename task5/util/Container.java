package task5.util;

public class Container<T> implements UniList<T> {

    private UniList<T> uniList;

    public Container() {
        this.uniList = new ArList<>();
    }

    @Override
    public void add(T o) {
        uniList.add(o);
    }

    @Override
    public void remove(int i) {
        uniList.remove(i);
    }

    @Override
    public T get(int i) {
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
