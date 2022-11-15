package com.higginsn.amazon.grokking.fastandslow;

import com.higginsn.models.ListNode;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/N7rwVyAZl6D
 */
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode tail = head.next;
        while (tail != null && tail != head) {
            head = head.next;
            tail = tail.next;
            if (tail == null) {
                return false;
            }
            tail = tail.next;
        }

        return head == tail;
    }

}
