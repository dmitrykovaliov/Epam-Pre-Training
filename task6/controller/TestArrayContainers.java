package task6.controller;

import task6.exception.IllegalSizeException;
import task6.exception.OutIndexException;
import task6.util.array.ArListQueue;
import task6.util.array.ArListStack;
import task6.view.View;


public class TestArrayContainers {
    public static void main(String[] args) {

        try {
            ArListStack<Integer> myStack = new ArListStack<>(5);
            ArListQueue<Integer> myQueue = new ArListQueue<>(5);

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

        } catch (IllegalSizeException e) {
            e.printStackTrace();
        } catch (OutIndexException e) {
            e.printStackTrace();
        }


    }
}
