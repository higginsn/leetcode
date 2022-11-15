package com.higginsn.amazon.grokking.fastandslow;

import com.higginsn.models.ListNode;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/3j5GD3EQMGM
 */
public class MiddleOfLinkedList {

    public static ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tail = head.next;
        while (tail != null) {
            head = head.next;
            tail = tail.next;
            if (tail != null) {
                tail = tail.next;
            }
        }
        return head;
    }

}
