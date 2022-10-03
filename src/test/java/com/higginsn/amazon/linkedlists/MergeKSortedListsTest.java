package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {

    private final MergeKSortedLists sut = new MergeKSortedLists();

    @Test
    public void example1() {
        ListNode[] input = new ListNode[]{
                new ListNode(1, 4, 5),
                new ListNode(1, 3, 4),
                new ListNode(2, 6)};
        ListNode expected = new ListNode(1, 1, 2, 3, 4, 4, 5, 6);

        Assertions.assertEquals(expected, sut.mergeKLists(input));
    }

    @Test
    public void example2() {
        ListNode[] input = new ListNode[]{};
        ListNode expected = null;

        Assertions.assertEquals(expected, sut.mergeKLists(input));
    }

    @Test
    public void example3() {
        ListNode[] input = new ListNode[]{new ListNode()};
        ListNode expected = new ListNode();

        Assertions.assertEquals(expected, sut.mergeKLists(input));
    }

    @Test
    public void example4() {
        ListNode[] input = new ListNode[]{null,
                new ListNode(-1, 5, 11),
                null,
                new ListNode(6, 10)};
        ListNode expected = new ListNode(-1, 5, 6, 10, 11);

        Assertions.assertEquals(expected, sut.mergeKLists(input));
    }

}