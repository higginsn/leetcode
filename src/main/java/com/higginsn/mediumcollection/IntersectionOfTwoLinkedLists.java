package com.higginsn.mediumcollection;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/785/
 */
public class IntersectionOfTwoLinkedLists {

    // input: two linked lists
    // output: intersecting node if it exists, else null
    // assumptions: no cycles,
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode iteratorA = headA;
        ListNode iteratorB = headB;

        ListNode result = null;
        while (iteratorA != null || iteratorB != null) {
            if (iteratorA == null) {
                iteratorA = headB;
            }
            if (iteratorB == null) {
                iteratorB = headA;
            }

            if (iteratorA == iteratorB) {
                if (result == null) {
                    result = iteratorA;
                }
            } else {
                result = null;
            }

            iteratorA = iteratorA.next;
            iteratorB = iteratorB.next;
        }

        return result;
    }

}
