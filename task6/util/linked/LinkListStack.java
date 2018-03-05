package task6.util.linked;

import task6.exception.EmptySetException;

public class LinkListStack<T> extends LinkList <T>{

    public LinkListStack() {
        top = null;
        size = 0;
    }

    public void push(T obj){
        Node nod= new Node();
        nod.setItem(obj);
        nod.setNext(top);
        top=nod;
        size++;

    }


    public T pop() throws EmptySetException {
        if(isEmpty()){
           throw new EmptySetException("Empty stack");
        }
        T obj=top.getItem();
        top=top.getNext();
        size--;
        return obj;
    }


}
