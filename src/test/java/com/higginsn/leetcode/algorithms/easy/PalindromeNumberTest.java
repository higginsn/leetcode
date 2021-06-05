package com.higginsn.leetcode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    private final PalindromeNumber sut = new PalindromeNumber();

    @Test
    public void example1() {
        int input = 121;
        Assertions.assertTrue(sut.isPalindrome(input));
    }

    @Test
    public void example2() {
        int input = -121;
        Assertions.assertFalse(sut.isPalindrome(input));
    }

    @Test
    public void example3() {
        int input = 10;
        Assertions.assertFalse(sut.isPalindrome(input));
    }

    @Test
    public void example4() {
        int input = -101;
        Assertions.assertFalse(sut.isPalindrome(input));
    }

    @Test
    public void inputWithDuplicateMiddleEntriesExpectTrue() {
        int input = 1221;
        Assertions.assertTrue(sut.isPalindrome(input));
    }

}