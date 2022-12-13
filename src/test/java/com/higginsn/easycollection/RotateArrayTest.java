package com.higginsn.easycollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    private final RotateArray sut = new RotateArray();

    @Test
    public void example1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        sut.rotate(nums, k);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    public void example2() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;

        int[] expected = new int[]{3, 99, -1, -100};
        sut.rotate(nums, k);
        Assertions.assertArrayEquals(expected, nums);
    }
}