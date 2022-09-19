package com.higginsn.google.leetcode.algorithms.google.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestUniqueSubstringTest {

    private final LongestUniqueSubstring sut = new LongestUniqueSubstring();

    @Test
    public void longestSubstringIsPrefix() {
        String input = "abcabcbb";
        int expected = 3;

        assertEquals(expected, sut.lengthOfLongestSubstring(input));
    }

    @Test
    public void repeatedString() {
        String input = "bbbbb";
        int expected = 1;

        assertEquals(expected, sut.lengthOfLongestSubstring(input));
    }

    @Test
    public void longestSubstringIsInMiddleOfString() {
        String input = "pwwkew";
        int expected = 3;

        assertEquals(expected, sut.lengthOfLongestSubstring(input));
    }

    @Test
    public void emptyString() {
        String input = "";
        int expected = 0;

        assertEquals(expected, sut.lengthOfLongestSubstring(input));
    }

}