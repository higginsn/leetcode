package com.higginsn.leetcode.algorithms.google.linkedlists;

import com.higginsn.leetcode.algorithms.models.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AddTwoNumbersTest {

    private final AddTwoNumbers sut = new AddTwoNumbers();

    @Test
    public void addingLargeNodesExpectSingleCarryOver() {
        ListNode l1 = arrangeListNode(3, 4, 2);
        ListNode l2 = arrangeListNode(4, 6, 5);

        ListNode expected = arrangeListNode(8, 0, 7);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    @Test
    public void addingZerosExpectZero() {
        ListNode zero = arrangeListNode(0);

        assertTrue(sut.compareListNodes(zero, sut.addTwoNumbers(zero, zero)));
    }

    @Test
    public void addingLargeNodesExpectCarryOverUntilEndOfList() {
        ListNode l1 = arrangeListNode(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = arrangeListNode(9, 9, 9, 9);

        ListNode expected = arrangeListNode(1, 0, 0, 0, 9, 9, 9, 8);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    @Test
    public void addingLargeNumbersAtEndOfBothListsExpectNewNodeCreated() {
        ListNode l1 = arrangeListNode(9);

        ListNode expected = arrangeListNode(1, 8);
        assertTrue((sut.compareListNodes(expected, sut.addTwoNumbers(l1, l1))));
    }

    @Test
    public void failure1() {
        ListNode l1 = arrangeListNode(1, 9, 9);
        ListNode l2 = arrangeListNode(1);

        ListNode expected = arrangeListNode(2, 0, 0);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    private ListNode arrangeListNode(int... values) {
        return new ListNode(Arrays.stream(values).toArray());
    }

}