package com.higginsn.top100.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

    private final MaximumSubarray sut = new MaximumSubarray();

    @Test
    public void example1() {
        int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;

        Assertions.assertEquals(expected, sut.maxSubArray(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{1};
        int expected = 1;

        Assertions.assertEquals(expected, sut.maxSubArray(input));
    }

    @Test
    public void example3() {
        int[] input = new int[]{5, 4, -1, 7, 8};
        int expected = 23;

        Assertions.assertEquals(expected, sut.maxSubArray(input));
    }

    @Test
    public void example4() {
        int[] input = new int[]{-2, -1};
        int expected = -1;

        Assertions.assertEquals(expected, sut.maxSubArray(input));
    }

    @Test
    public void example5() {
        int[] input = new int[]{-2, 1};
        int expected = 1;

        Assertions.assertEquals(expected, sut.maxSubArray(input));
    }

}