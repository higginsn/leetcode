package com.higginsn.amazon.linkedlists;

import com.higginsn.models.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CopyListWithRandomPointerTest {

    private final CopyListWithRandomPointer sut = new CopyListWithRandomPointer();

    @Test
    public void example1() {
        Node fifth = new Node(1);
        Node fourth = new Node(10, fifth);
        Node third = new Node(11, fourth);
        Node second = new Node(13, third);
        Node first = new Node(7, second);

        first.random = null;
        second.random = first;
        third.random = fifth;
        fourth.random = third;
        fifth.random = first;

        Assertions.assertEquals(first, sut.copyRandomList(first));
    }

    @Test
    public void example2() {
        Node second = new Node(2);
        Node first = new Node(1, second);

        first.random = second;
        second.random = second;

        Assertions.assertEquals(first, sut.copyRandomList(first));
    }

    @Test
    public void example3() {
        Node third = new Node(3);
        Node second = new Node(3, third);
        Node first = new Node(3, second);

        first.random = null;
        second.random = first;
        third.random = null;

        Assertions.assertEquals(first, sut.copyRandomList(first));
    }


}