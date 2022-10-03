package com.higginsn.google.leetcode.algorithms.google.linkedlists;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeTest {

    private final RemoveNthNode sut = new RemoveNthNode();

    @Test
    public void example1() {
        ListNode list = new ListNode(1, 2, 3, 4, 5);
        int nodeToRemove = 2;

        ListNode expected = new ListNode(1, 2, 3, 5);
        Assertions.assertEquals(expected, sut.removeNthFromEnd(list, nodeToRemove));
    }

    @Test
    public void example2() {
        ListNode list = new ListNode(1);
        int nodeToRemove = 1;

        Assertions.assertNull(sut.removeNthFromEnd(list, nodeToRemove));
    }

    @Test
    public void example3() {
        ListNode list = new ListNode(1, 2);
        int nodeToRemove = 1;

        ListNode expected = new ListNode(1);
        Assertions.assertEquals(expected, sut.removeNthFromEnd(list, nodeToRemove));
    }

    @Test
    public void example4() {
        ListNode list = new ListNode(1, 2);
        int nodeToRemove = 2;

        ListNode expected = new ListNode(2);
        Assertions.assertEquals(expected, sut.removeNthFromEnd(list, nodeToRemove));
    }

}