package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/77/linked-list/2977/
 */
public class ReverseNodesInKGroup {

    /**
     * Method returns a modified linked list, where its nodes are reversed in each of its
     * k-sized groups.
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = null;
        // Two iterators. One specifies the start of a group, the other specifies the start of the next group
        // For each k groups:
        //   Walk second iterator k places
        //   Split list at second iterator. Reverse list from [first, second)
        //   Reattach list, move first iterator to second

        ListNode tail = head;
        int groupSize = 0;
        ListNode prevTail = null;
        while (tail != null) {
            groupSize++;
            if (groupSize == k) {
                ListNode temp = tail.next;
                tail.next = null;
                head = reverseListNode(head);
                if (result == null) {
                    result = head;
                }
                while (head.next != null) {
                    head = head.next;
                }
                head.next = temp;
                if (prevTail != null) {
                    prevTail.next = tail;
                }
                tail = temp;
                prevTail = head;
                head = tail;
                groupSize = 0;
            } else {
                tail = tail.next;
            }
        }

        return result;
    }

    // Method to reverse a ListNode in place
    private ListNode reverseListNode(ListNode head) {
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
