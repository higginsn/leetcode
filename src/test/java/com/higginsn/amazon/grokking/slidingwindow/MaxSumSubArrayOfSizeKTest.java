package com.higginsn.amazon.grokking.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxSumSubArrayOfSizeKTest {

    @Test
    public void example1() {
        int[] input = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;

        int expected = 9;
        Assertions.assertEquals(expected, MaxSumSubArrayOfSizeK.findMaxSumSubArray(k, input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{2, 3, 4, 1, 5};
        int k = 2;

        int expected = 7;
        Assertions.assertEquals(expected, MaxSumSubArrayOfSizeK.findMaxSumSubArray(k, input));
    }
}