package task6;

import task6.util.MyQueue;
import task6.util.MyStack;

import java.util.LinkedList;

public class TestContainers {
    public static void main(String[] args) {

        MyStack<Integer> myStack = new MyStack<>(5);
        MyQueue<Integer> myQueue = new MyQueue<>(5);

            myStack.push(5);
            myStack.push(4);
            myStack.push(3);
            myStack.push(2);
            View.print(myStack.isFull());
            View.print(myStack.isEmpty());
            myStack.push(1);

            View.print(myStack.peek());
            View.print(myStack.isFull());
            View.print(myStack.pop());
            View.print(myStack.pop());
            View.print(myStack.pop());
            View.print(myStack.pop());
            View.print(myStack.pop());

            View.print(myStack.isEmpty());

            View.print("======================");

            myQueue.enqueue(5);
            myQueue.enqueue(4);
            myQueue.enqueue(3);
            myQueue.enqueue(2);
            View.print(myQueue.isFull());
            View.print(myQueue.isEmpty());
            myQueue.enqueue(1);

            View.print(myQueue.peek());
            View.print(myQueue.isFull());
            View.print(myQueue.dequeue());
            View.print(myQueue.dequeue());
            View.print(myQueue.dequeue());
            View.print(myQueue.dequeue());
            View.print(myQueue.dequeue());

            View.print(myQueue.isEmpty());



    }
}
