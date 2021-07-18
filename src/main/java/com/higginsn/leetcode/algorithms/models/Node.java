package com.higginsn.leetcode.algorithms.models;

import java.util.Objects;

public class Node {

    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Node t = (Node) o;

        return val == t.val
                && Objects.equals(next.val, t.next.val)
                && ((random == null && t.random == null) || (random != null && t.random != null));
    }

}
