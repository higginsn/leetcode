package com.higginsn.amazon.grokking.fastandslow;

import com.higginsn.models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

    @Test
    public void example1() {
        ListNode head = new ListNode(2, 4, 6, 4, 2);
        Assertions.assertTrue(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void example2() {
        ListNode head = new ListNode(2, 4, 6, 4, 2, 2);
        Assertions.assertFalse(PalindromeLinkedList.isPalindrome(head));
    }
}