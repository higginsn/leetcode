package com.higginsn.amazon.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumIITest {

    private final TwoSumII sut = new TwoSumII();

    @Test
    public void example1() {
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, sut.twoSum(input, target));
    }

    @Test
    public void example2() {
        int[] input = new int[]{2, 3, 4};
        int target = 6;

        int[] expected = new int[]{1, 3};
        Assertions.assertArrayEquals(expected, sut.twoSum(input, target));
    }

    @Test
    public void example3() {
        int[] input = new int[]{-1, 0};
        int target = -1;

        int[] expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, sut.twoSum(input, target));
    }
}