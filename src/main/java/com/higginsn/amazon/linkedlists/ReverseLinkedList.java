package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/77/linked-list/2979/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tail = head.next;
        head.next = null;
        while (tail != null) {
            ListNode temp = tail.next;
            tail.next = head;
            head = tail;
            tail = temp;
        }

        return head;
    }

}
