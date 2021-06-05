package com.higginsn.leetcode.algorithms.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AddTwoNumbersTest {

    private final AddTwoNumbers sut = new AddTwoNumbers();

    @Test
    public void addingLargeNodesExpectSingleCarryOver() {
        AddTwoNumbers.ListNode l1 = arrangeListNode(3, 4, 2);
        AddTwoNumbers.ListNode l2 = arrangeListNode(4, 6, 5);

        AddTwoNumbers.ListNode expected = arrangeListNode(8, 0, 7);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    @Test
    public void addingZerosExpectZero() {
        AddTwoNumbers.ListNode zero = arrangeListNode(0);

        assertTrue(sut.compareListNodes(zero, sut.addTwoNumbers(zero, zero)));
    }

    @Test
    public void addingLargeNodesExpectCarryOverUntilEndOfList() {
        AddTwoNumbers.ListNode l1 = arrangeListNode(9, 9, 9, 9, 9, 9, 9);
        AddTwoNumbers.ListNode l2 = arrangeListNode(9, 9, 9, 9);

        AddTwoNumbers.ListNode expected = arrangeListNode(1, 0, 0, 0, 9, 9, 9, 8);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    @Test
    public void addingLargeNumbersAtEndOfBothListsExpectNewNodeCreated() {
        AddTwoNumbers.ListNode l1 = arrangeListNode(9);

        AddTwoNumbers.ListNode expected = arrangeListNode(1, 8);
        assertTrue((sut.compareListNodes(expected, sut.addTwoNumbers(l1, l1))));
    }

    @Test
    public void failure1() {
        AddTwoNumbers.ListNode l1 = arrangeListNode(1, 9, 9);
        AddTwoNumbers.ListNode l2 = arrangeListNode(1);

        AddTwoNumbers.ListNode expected = arrangeListNode(2, 0, 0);
        assertTrue(sut.compareListNodes(expected, sut.addTwoNumbers(l1, l2)));
    }

    private AddTwoNumbers.ListNode arrangeListNode(int... values) {
        return new AddTwoNumbers.ListNode(Arrays.stream(values).toArray());
    }

}