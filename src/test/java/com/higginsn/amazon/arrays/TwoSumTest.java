package com.higginsn.amazon.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private final TwoSum sut = new TwoSum();

    @Test
    public void example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, sut.twoSum(nums, target));
    }

    @Test
    public void example2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, sut.twoSum(nums, target));
    }

    @Test
    public void example3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, sut.twoSum(nums, target));
    }

    @Test
    public void example4() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, sut.twoSum(nums, target));
    }
}
