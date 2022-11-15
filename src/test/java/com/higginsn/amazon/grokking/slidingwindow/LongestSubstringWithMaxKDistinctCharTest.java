package com.higginsn.amazon.grokking.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithMaxKDistinctCharTest {

    @Test
    public void example1() {
        String input = "araaci";
        int k = 2;

        int expected = 4;
        Assertions.assertEquals(expected, LongestSubstringWithMaxKDistinctChar.findLength(input, k));
    }

    @Test
    public void example2() {
        String input = "araaci";
        int k = 1;

        int expected = 2;
        Assertions.assertEquals(expected, LongestSubstringWithMaxKDistinctChar.findLength(input, k));
    }

    @Test
    public void example3() {
        String input = "cbbebi";
        int k = 3;

        int expected = 5;
        Assertions.assertEquals(expected, LongestSubstringWithMaxKDistinctChar.findLength(input, k));
    }

    @Test
    public void example4() {
        String input = "cbbebi";
        int k = 10;

        int expected = 6;
        Assertions.assertEquals(expected, LongestSubstringWithMaxKDistinctChar.findLength(input, k));
    }
}