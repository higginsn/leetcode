package com.higginsn.google.leetcode.algorithms.stacks;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/
 */
public class CircularQueue {

    int[] data;
    int headIndex = -1;
    int tailIndex = -1;
    int size;

    public CircularQueue(int k) {
        data = new int[k];
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            headIndex = 0;
        }

        tailIndex = (tailIndex + 1) % size;
        data[tailIndex] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (tailIndex == headIndex) {
            headIndex = -1;
            tailIndex = -1;
            return true;
        }

        headIndex = (headIndex + 1) % size;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return data[headIndex];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return data[tailIndex];
    }

    public boolean isEmpty() {
        return headIndex == -1;
    }

    public boolean isFull() {
        return (tailIndex + 1) % size == headIndex;
    }

}
