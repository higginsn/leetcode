package com.higginsn.google.leetcode.algorithms.google.arrays;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        int last = lists.length - 1;

        while (last != 0) {
            int left = 0;
            int right = last;

            while (left < right) {
                lists[left] = mergeTwoLists(lists[left], lists[right]);
                left++;
                right--;

                if (left >= right) {
                    last = right;
                }
            }
        }

        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode head;
        if (l1.val < l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode iterator = head;
        while (l1 != null && l2 != null) {
            ListNode temp;
            if (l1.val < l2.val) {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            iterator.next = temp;
            iterator = temp;
        }

        if (l1 != null) {
            iterator.next = l1;
        } else {
            iterator.next = l2;
        }

        return head;
    }

}
