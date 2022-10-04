package com.higginsn.top100.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumProductSubarrayTest {

    private final MaximumProductSubarray sut = new MaximumProductSubarray();

    @Test
    public void example1() {
        int[] input = new int[]{2, 3, -2, 4};
        int expected = 6;

        Assertions.assertEquals(expected, sut.maxProduct(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{-2, 0, -1};
        int expected = 0;

        Assertions.assertEquals(expected, sut.maxProduct(input));
    }

    @Test
    public void example3() {
        int[] input = new int[]{-2, 3, -4};
        int expected = 24;

        Assertions.assertEquals(expected, sut.maxProduct(input));
    }

    @Test
    public void example4() {
        int[] input = new int[]{-4, -3, -2};
        int expected = 12;

        Assertions.assertEquals(expected, sut.maxProduct(input));
    }
}