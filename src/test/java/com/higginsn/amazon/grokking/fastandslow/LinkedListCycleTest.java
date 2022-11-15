package com.higginsn.amazon.grokking.fastandslow;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    @Test
    public void example1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;

        Assertions.assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void example2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Assertions.assertFalse(LinkedListCycle.hasCycle(head));
    }
}