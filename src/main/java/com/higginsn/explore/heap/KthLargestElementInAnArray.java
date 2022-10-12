package com.higginsn.explore.heap;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/explore/featured/card/heap/646/practices/4014/
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);

        int index = 0;
        while (index < k) {
            priorityQueue.add(nums[index]);
            index++;
        }

        while (index < nums.length) {
            Integer top = priorityQueue.peek();
            if (top != null && nums[index] > top) {
                priorityQueue.poll();
                priorityQueue.add(nums[index]);
            }
            index++;
        }

        if (priorityQueue.peek() != null) {
            return priorityQueue.peek();
        }
        return 0;
    }

}
