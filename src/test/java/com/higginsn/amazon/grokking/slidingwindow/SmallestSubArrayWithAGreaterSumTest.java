package com.higginsn.amazon.grokking.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestSubArrayWithAGreaterSumTest {

    @Test
    public void example1() {
        int[] input = new int[]{2, 1, 5, 2, 3, 2};
        int S = 7;

        int expected = 2;
        Assertions.assertEquals(expected, SmallestSubArrayWithAGreaterSum.findMinSubArray(S, input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{2, 1, 5, 2, 8};
        int S = 7;

        int expected = 1;
        Assertions.assertEquals(expected, SmallestSubArrayWithAGreaterSum.findMinSubArray(S, input));
    }

    @Test
    public void example3() {
        int[] input = new int[]{3, 4, 1, 1, 6};
        int S = 8;

        int expected = 3;
        Assertions.assertEquals(expected, SmallestSubArrayWithAGreaterSum.findMinSubArray(S, input));
    }
}