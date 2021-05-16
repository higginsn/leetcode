package com.higginsn.leetcode.algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    /**
     * @param l1 non-empty list of non-negative integer in reverse order
     * @param l2 non-empty list of non-negative integer in reverse order
     * @return sum of l1 and l2 in reverse order
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersWithCarry(l1, l2, 0);
    }

    private ListNode addTwoNumbersWithCarry(ListNode l1, ListNode l2, int carry) {

        int newValue = l1.val + l2.val + carry;
        int newCarry = 0;
        if (newValue >= 10) {
            newCarry = 1;
            newValue -= 10;
        }

        if (l1.next == null && l2.next == null) {
            return new ListNode(newValue, newCarry == 1 ? new ListNode(1, null) : null);
        } else if (l1.next == null) {
            return new ListNode(newValue, addCarryToListNode(l2.next, newCarry));
        } else if (l2.next == null) {
            return new ListNode(newValue, addCarryToListNode(l1.next, newCarry));
        }

        return new ListNode(newValue, addTwoNumbersWithCarry(l1.next, l2.next, newCarry));
    }

    private ListNode addCarryToListNode(ListNode l1, int carry) {
        if (carry == 0) {
            return l1;
        }

        int newValue = l1.val + carry;
        if (newValue >= 10) {
            if (l1.next == null) {
                return new ListNode(0, new ListNode(1, null));
            }
            return new ListNode(0, addCarryToListNode(l1.next, 1));
        }

        return new ListNode(newValue, l1.next);

    }


    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class ListNode {
        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int[] values) {
            ListNode head = null;
            for (int value : values) {
                ListNode node = new ListNode(value, head);
                head = node;
            }

            this.val = head.val;
            this.next = head.next;
        }
    }
    public boolean compareListNodes(AddTwoNumbers.ListNode l1, AddTwoNumbers.ListNode l2) {
        System.out.println(String.format("l1.val = %d, l2.val = %d", l1.val, l2.val));
        if (l1.val != l2.val) {
            return false;
        }

        if (l1.next != null && l2.next != null) {
            return compareListNodes(l1.next, l2.next);
        }

        return l1.next == null && l2.next == null;
    }

}
