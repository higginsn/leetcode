package com.higginsn.amazon.grokking.fastandslow;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MiddleOfLinkedListTest {

    @Test
    public void example1() {
        ListNode head = new ListNode(1, 2, 3, 4, 5);
        ListNode expected = head.next.next;

        Assertions.assertEquals(expected, MiddleOfLinkedList.findMiddle(head));
    }

    @Test
    public void example2() {
        ListNode head = new ListNode(1, 2, 3, 4, 5, 6);
        ListNode expected = head.next.next.next;

        Assertions.assertEquals(expected, MiddleOfLinkedList.findMiddle(head));
    }

    @Test
    public void example3() {
        ListNode head = new ListNode(1, 2, 3, 4, 5, 6, 7);
        ListNode expected = head.next.next.next;

        Assertions.assertEquals(expected, MiddleOfLinkedList.findMiddle(head));
    }
}