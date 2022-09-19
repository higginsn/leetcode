package com.higginsn.google.leetcode.algorithms.stacks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1368/
 */
public class MovingAverage {

    private Queue<Integer> values = new LinkedList<>();
    private int size;

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        if (values.size() == size) {
            values.poll();
        }

        values.offer(val);
        double sum = values.stream().mapToInt(Integer::intValue).sum();
        return sum / values.size();
    }

}
