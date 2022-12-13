package com.higginsn.mediumcollection;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/784/
 */
public class OddEvenLinkedList {

    // input: head of linked list
    // output: linked list with odd indices followed by even indicies
    // example: 1-2-3-4-5 becomes 1-3-5-2-4
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode result = head;

        ListNode oddList = result;
        ListNode evenList = result.next;
        ListNode evenHead = evenList;
        head = head.next.next;

        while (head != null && head.next != null) {
            oddList.next = head;
            oddList = oddList.next;
            head = head.next;
            evenList.next = head;
            evenList = evenList.next;
            head = head.next;
        }

        if (head != null) {
            oddList.next = head;
            oddList = oddList.next;
            evenList.next = null;
        }
        oddList.next = evenHead;
        return result;
    }

}
