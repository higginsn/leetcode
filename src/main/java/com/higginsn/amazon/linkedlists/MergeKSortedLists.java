package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/77/linked-list/512/
 */
public class MergeKSortedLists {

    private static final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }

        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i < lists.length - interval; i += (interval * 2)) {
                lists[i] = mergeTwoSortedLists.mergeTwoLists(lists[i], lists[i+interval]);
            }
            interval *= 2;
        }

        return lists[0];
    }

}
