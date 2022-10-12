package com.higginsn.explore.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestElementInAnArrayTest {

    private final KthLargestElementInAnArray sut = new KthLargestElementInAnArray();

    @Test
    public void example1() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;

        int expected = 5;
        Assertions.assertEquals(expected, sut.findKthLargest(nums, k));
    }

    @Test
    public void example12() {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        int expected = 4;
        Assertions.assertEquals(expected, sut.findKthLargest(nums, k));
    }
}