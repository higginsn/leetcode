package com.higginsn.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    private final ReverseInteger sut = new ReverseInteger();

    @Test
    public void reversePositiveNumber() {
        int input = 123;
        int expected = 321;
        assertEquals(expected, sut.reverse(input));
    }

    @Test
    public void reverseNegativeNumber() {
        int input = -123;
        int expected = -321;
        assertEquals(expected, sut.reverse(input));
    }

    @Test
    public void reverseTrailingZeroes() {
        int input = 120;
        int expected = 21;
        assertEquals(expected, sut.reverse(input));
    }

    @Test
    public void reverseZero() {
        int expected = 0;
        assertEquals(expected, sut.reverse(expected));
    }

    @Test
    public void reverseResultsInGreaterThanMaxIntExpectZero() {
        int input = 1000000003;
        int expected = 0;
        assertEquals(expected, sut.reverse(input));
    }

    @Test
    public void reverseResultsInLessThanMinIntExpectZero() {
        int input = -1000000003;
        int expected = 0;
        assertEquals(expected, sut.reverse(input));
    }

}