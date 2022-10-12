package com.higginsn.explore.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/explore/learn/card/heap/646/practices/4016/
 */
public class KthLargestElementInAStream {

    private PriorityQueue<Integer> priorityQueue;
    private int maxSize;

    public KthLargestElementInAStream(int k, int[] nums) {
        priorityQueue = new PriorityQueue<>(k, Comparator.comparingInt(o -> o));
        maxSize = k;
        for (int num : nums) {
            priorityQueue.add(num);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
    }

    public int add(int val) {
        priorityQueue.add(val);
        if (priorityQueue.size() > maxSize) {
            priorityQueue.poll();
        }
        return (priorityQueue.peek() == null) ? 0 : priorityQueue.peek();
    }
}
