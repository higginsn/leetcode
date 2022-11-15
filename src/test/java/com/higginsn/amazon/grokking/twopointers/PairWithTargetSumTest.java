package com.higginsn.amazon.grokking.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairWithTargetSumTest {

    @Test
    public void example1() {
        int[] input = new int[]{1, 2, 3, 4, 6};
        int target = 6;

        int[] expected = new int[]{1, 3};
        Assertions.assertArrayEquals(expected, PairWithTargetSum.search(input, target));
    }

    @Test
    public void example2() {
        int[] input = new int[]{2, 5, 9, 11};
        int target = 11;

        int[] expected = new int[]{0, 2};
        Assertions.assertArrayEquals(expected, PairWithTargetSum.search(input, target));
    }
}