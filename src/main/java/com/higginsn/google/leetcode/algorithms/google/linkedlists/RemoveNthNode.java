package com.higginsn.google.leetcode.algorithms.google.linkedlists;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Given the head of a linked list, remove the nth node from the end of the list and return its head
 */
public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode iterator = head;
        ListNode delayedIterator = head;

        for (int i = 0; i < n; i++) {
            iterator = iterator.next;
        }

        if (iterator == null) {
            head = head.next;
            return head;
        }


        while (iterator.next != null) {
            iterator = iterator.next;
            delayedIterator = delayedIterator.next;
        }

        delayedIterator.next = delayedIterator.next.next;

        return head;
    }

}
