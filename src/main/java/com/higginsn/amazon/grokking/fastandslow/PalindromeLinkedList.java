package com.higginsn.amazon.grokking.fastandslow;

import com.higginsn.amazon.linkedlists.ReverseLinkedList;
import com.higginsn.models.ListNode;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/B1PzmqOKDLQ
 */
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        ListNode middle = MiddleOfLinkedList.findMiddle(head);

        ListNode reversed = reverse(middle);
        ListNode copyReversed = reversed;

        boolean isPalindrome = true;
        while(head != null && reversed != null) {
            if (head.val != reversed.val) {
                isPalindrome = false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        reverse(copyReversed);

        return isPalindrome;
    }

    private static ListNode reverse(ListNode head) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        return reverseLinkedList.reverseList(head);
    }
}
