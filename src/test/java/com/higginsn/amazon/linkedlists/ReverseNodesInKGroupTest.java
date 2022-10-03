package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseNodesInKGroupTest {

    private final ReverseNodesInKGroup sut = new ReverseNodesInKGroup();

    @Test
    public void example1() {
        ListNode input = new ListNode(1, 2, 3, 4, 5);
        int k = 2;

        ListNode expected = new ListNode(2, 1, 4, 3, 5);
        Assertions.assertEquals(expected, sut.reverseKGroup(input, k));
    }

    @Test
    public void example2() {
        ListNode input = new ListNode(1, 2, 3, 4, 5);
        int k = 3;

        ListNode expected = new ListNode(3, 2, 1, 4, 5);
        Assertions.assertEquals(expected, sut.reverseKGroup(input, k));
    }

}