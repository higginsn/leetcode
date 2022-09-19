package com.higginsn.google.leetcode.algorithms.google.linkedlists;

import com.higginsn.google.leetcode.algorithms.models.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AddTwoNumbersTest {

    private final AddTwoNumbers sut = new AddTwoNumbers();

    @Test
    public void addingLargeNodesExpectSingleCarryOver() {
        ListNode l1 = new ListNode(2, 4, 3);
        ListNode l2 = new ListNode(5, 6, 4);

        ListNode expected = new ListNode(7, 0, 8);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    @Test
    public void addingZerosExpectZero() {
        ListNode zero = new ListNode(0);

        assertTrue(sut.compareListNodes(zero, sut.addTwoNumbers(zero, zero)));
    }

    @Test
    public void addingLargeNodesExpectCarryOverUntilEndOfList() {
        ListNode l1 = new ListNode(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = new ListNode(9, 9, 9, 9);

        ListNode expected = new ListNode(8, 9, 9, 9, 0, 0, 0, 1);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    @Test
    public void addingLargeNumbersAtEndOfBothListsExpectNewNodeCreated() {
        ListNode l1 = new ListNode(9);

        ListNode expected = new ListNode(8, 1);
        assertTrue((sut.compareListNodes(expected, sut.addTwoNumbers(l1, l1))));
    }

    @Test
    public void failure1() {
        ListNode l1 = new ListNode(9, 9, 1);
        ListNode l2 = new ListNode(1);

        ListNode expected = new ListNode(0, 0, 2);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }
    
}