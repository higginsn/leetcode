package com.higginsn.mediumcollection;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

    private final OddEvenLinkedList sut = new OddEvenLinkedList();

    @Test
    public void OddSizedList() {
        ListNode input = new ListNode(1, 2, 3, 4, 5);
        ListNode expected = new ListNode(1, 3, 5, 2, 4);

        Assertions.assertEquals(expected, sut.oddEvenList(input));
    }

    @Test
    public void EvenSizedList() {
        ListNode input = new ListNode(1, 2, 3, 4, 5, 6);
        ListNode expected = new ListNode(1, 3, 5, 2, 4, 6);

        Assertions.assertEquals(expected, sut.oddEvenList(input));
    }

    @Test
    public void SingleElementList() {
        ListNode input = new ListNode(1);
        Assertions.assertEquals(input, sut.oddEvenList(input));
    }

    @Test
    public void EmptyList() {
        ListNode empty = new ListNode();
        Assertions.assertEquals(empty, sut.oddEvenList(empty));
    }
}