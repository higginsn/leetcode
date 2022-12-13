package com.higginsn.mediumcollection;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoLinkedListsTest {

    private final IntersectionOfTwoLinkedLists sut = new IntersectionOfTwoLinkedLists();

    @Test
    public void SameList() {
        ListNode intersectingNode = new ListNode(1, 2, 3);
        Assertions.assertEquals(intersectingNode,
                sut.getIntersectionNode(intersectingNode, intersectingNode));
    }

    @Test
    public void FirstListLongerBeforeIntersect() {
        ListNode intersectingNode = new ListNode(1, 2, 3);
        ListNode listA = new ListNode(1, 2, 3);
        listA.next.next.next = intersectingNode;

        ListNode listB = new ListNode(1);
        listB.next = intersectingNode;

        Assertions.assertEquals(intersectingNode, sut.getIntersectionNode(listA, listB));
    }

    @Test
    public void SecondListLongerBeforeIntersect() {
        ListNode intersectingNode = new ListNode(1, 2, 3);
        ListNode listA = new ListNode(1);
        listA.next = intersectingNode;

        ListNode listB = new ListNode(1, 2, 3);
        listB.next.next.next = intersectingNode;

        Assertions.assertEquals(intersectingNode, sut.getIntersectionNode(listA, listB));
    }

    @Test
    public void EquidistantListBeforeIntersect() {
        ListNode intersectingNode = new ListNode(1, 2, 3);
        ListNode listA = new ListNode(1, 2);
        ListNode listB = new ListNode(1, 2);
        listA.next = listB.next = intersectingNode;
        Assertions.assertEquals(intersectingNode, sut.getIntersectionNode(listA, listB));
    }

    @Test
    public void NonIntersectingLists() {
        ListNode listA = new ListNode(1, 2, 3);
        ListNode listB = new ListNode(1, 2, 3);
        Assertions.assertNull(sut.getIntersectionNode(listA, listB));
    }

    @Test
    public void FirstListNull() {
        ListNode node = new ListNode(1, 2, 3);
        Assertions.assertNull(sut.getIntersectionNode(null, node));
    }

    @Test
    public void SecondListNull() {
        ListNode node = new ListNode(1, 2, 3);
        Assertions.assertNull(sut.getIntersectionNode(node, null));
    }
}