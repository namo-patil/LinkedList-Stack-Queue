package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3Numbers_whenAddedAnyNumberToQueue_ShouldBeAddedAtEnd() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueu(myFirstNode);
        myQueue.enqueu(mySecondNode);
        myQueue.enqueu(myThirdNode);
        myQueue.printQueue();
        INode checkIsEmpty = myQueue.isEmpty();
        Assert.assertEquals(myFirstNode, checkIsEmpty);
    }

    @Test
    public void given3Numbers_whenDeleteAnyNumberFromQueue_ShouldBeDeletedFromFirst() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueu(myFirstNode);
        myQueue.enqueu(mySecondNode);
        myQueue.enqueu(myThirdNode);
        myQueue.printQueue();
        INode deletedElement = myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode, deletedElement);
    }
}
