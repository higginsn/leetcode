package com.higginsn.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumsTest {

    private final TwoSums sut = new TwoSums();

    @Test
    public void example1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, sut.twoSums(nums, target));
    }

    @Test
    public void example2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, sut.twoSums(nums, target));
    }

    @Test
    public void example3() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, sut.twoSums(nums, target));
    }

    @Test
    public void example4() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, sut.twoSums(nums, target));
    }

}