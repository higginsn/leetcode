package com.higginsn.leetcode.algorithms.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int[] values) {
        ListNode head = null;
        for (int value : values) {
            ListNode node = new ListNode(value, head);
            head = node;
        }

        this.val = head.val;
        this.next = head.next;
    }

}
