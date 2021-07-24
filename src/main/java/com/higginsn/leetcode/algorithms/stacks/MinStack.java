package com.higginsn.leetcode.algorithms.stacks;

import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack/submissions/
 */
public class MinStack {
    private class Node {
        public int value;
        public int minValue;

        public Node(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
        }
    }
    private final Stack<Node> stack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
        } else {
            int currentMin = getMin();
            stack.push(new Node(val, Math.min(currentMin, val)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().minValue;
    }
}
