package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists sut = new MergeTwoSortedLists();

    @Test
    public void mergeEvenlyPopulatedLists() {
        ListNode l1 = new ListNode(1, 2, 4);
        ListNode l2 = new ListNode(1, 3, 4);

        ListNode expected = new ListNode(1, 1, 2, 3, 4, 4);
        Assertions.assertEquals(expected, sut.mergeTwoLists(l1, l2));
    }

    @Test
    public void mergeTwoEmptyLists() {
        Assertions.assertNull(sut.mergeTwoLists(null, null));
    }

    @Test
    public void mergeWithFirstListEmpty() {
        ListNode l1 = new ListNode(1, 2, 4);

        Assertions.assertEquals(l1, sut.mergeTwoLists(l1, null));
    }

    @Test
    public void mergeWithSecondListEmpty() {
        ListNode l1 = new ListNode(1, 2, 4);
        Assertions.assertEquals(l1, sut.mergeTwoLists(null, l1));
    }

    @Test
    public void mergeWithFirstListLongerThanSecondList() {
        ListNode l1 = new ListNode(1, 3);
        ListNode l2 = new ListNode(2, 4, 5, 6);

        ListNode expected = new ListNode(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(expected, sut.mergeTwoLists(l1, l2));
    }

    @Test
    public void mergeWithSecondListLongerThanFirstList() {
        ListNode l1 = new ListNode(2, 4, 5, 6);
        ListNode l2 = new ListNode(1, 3);

        ListNode expected = new ListNode(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(expected, sut.mergeTwoLists(l1, l2));
    }

}