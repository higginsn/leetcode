package com.higginsn.amazon.linkedlists;

import com.higginsn.models.ListNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/77/linked-list/513/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        int firstSum = l1.val + l2.val;
        if (firstSum > 9) {
            firstSum = firstSum % 10;
            carry = 1;
        }
        ListNode head = new ListNode(firstSum);
        l1 = l1.next;
        l2 = l2.next;

        ListNode iterator = head;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(sum);
            iterator.next = temp;
            iterator = temp;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            l1 = l2;
        }

        while (l1 != null) {
            int sum = l1.val + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode temp = new ListNode(sum);
            iterator.next = temp;
            iterator = temp;
            l1 = l1.next;
        }

        if (carry == 1) {
            ListNode temp = new ListNode(1);
            iterator.next = temp;
        }

        return head;
    }

}
