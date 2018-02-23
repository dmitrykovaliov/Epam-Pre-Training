package task6;

import task6.util.MyLinkedQueue;
import task6.util.MyLinkedStack;

import java.util.LinkedList;

public class TestLinkedContainers {
    public static void main(String[] args) {

        MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();
        MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();

            myLinkedStack.push(5);
            myLinkedStack.push(4);
            myLinkedStack.push(3);
            myLinkedStack.push(2);

            View.print(myLinkedStack.isEmpty());
            myLinkedStack.push(1);

            View.print(myLinkedStack.peek());

            View.print(myLinkedStack.pop());
            View.print(myLinkedStack.pop());
            View.print(myLinkedStack.pop());
            View.print(myLinkedStack.pop());
            View.print(myLinkedStack.pop());

            View.print(myLinkedStack.isEmpty());

            View.print("======================");

            myLinkedQueue.enqueue(5);
            myLinkedQueue.enqueue(4);
            myLinkedQueue.enqueue(3);
            myLinkedQueue.enqueue(2);

            View.print(myLinkedQueue.isEmpty());
            myLinkedQueue.enqueue(1);

            View.print(myLinkedQueue.peek());

            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());

            View.print(myLinkedQueue.isEmpty());

    }
}
