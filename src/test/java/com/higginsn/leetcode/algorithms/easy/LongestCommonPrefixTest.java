package com.higginsn.leetcode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix sut = new LongestCommonPrefix();

    @Test
    public void example1() {
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        Assertions.assertEquals(expected, sut.longestCommonPrefix(input));
    }

    @Test
    public void example2() {
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        Assertions.assertEquals(expected, sut.longestCommonPrefix(input));
    }

    @Test
    public void longestCommonPrefixWithRepeatedInputsExpectInput() {
        String expected = "quick";
        String[] input = {expected, expected, expected};
        Assertions.assertEquals(expected, sut.longestCommonPrefix(input));
    }

    @Test
    public void longestCommonPrefixWithEmptyInputExpectEmptyString() {
        String expected = "";
        String[] input = { };
        Assertions.assertEquals(expected, sut.longestCommonPrefix(input));
    }

}