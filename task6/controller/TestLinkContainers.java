package task6.controller;

import task6.exception.EmptySetException;
import task6.util.linked.LinkListQueue;
import task6.util.linked.LinkListStack;
import task6.view.View;

public class TestLinkContainers {
    public static void main(String[] args) {

        try {
            LinkListStack<Integer> myLinkedStack = new LinkListStack<>();
            LinkListQueue<Integer> myLinkedQueue = new LinkListQueue<>();

            myLinkedStack.push(5);
            myLinkedStack.push(4);
            myLinkedStack.push(3);
            myLinkedStack.push(2);

            View.print(myLinkedStack.isEmpty());
            myLinkedStack.push(1);

            View.print(myLinkedStack.peak());

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

            View.print(myLinkedQueue.peak());

           View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());
            View.print(myLinkedQueue.dequeue());

            View.print(myLinkedQueue.isEmpty());
        } catch (EmptySetException e) {
            e.printStackTrace();
        }

    }
}
