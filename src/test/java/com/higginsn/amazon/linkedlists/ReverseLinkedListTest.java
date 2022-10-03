package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    private final ReverseLinkedList sut = new ReverseLinkedList();

    @Test
    public void example1() {
        ListNode input = new ListNode(1, 2, 3, 4, 5);
        ListNode expected = new ListNode(5, 4, 3, 2, 1);

        Assertions.assertEquals(expected, sut.reverseList(input));
    }

    @Test
    public void example2() {
        ListNode input = new ListNode(1, 2);
        ListNode expected = new ListNode(2, 1);

        Assertions.assertEquals(expected, sut.reverseList(input));
    }

}