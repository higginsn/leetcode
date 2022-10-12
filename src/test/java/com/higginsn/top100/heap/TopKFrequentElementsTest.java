package com.higginsn.top100.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

    private final TopKFrequentElements sut = new TopKFrequentElements();

    @Test
    public void example1() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] expected = new int[]{1, 2};
        Assertions.assertEquals(expected, sut.topKFrequent(nums, k));
    }

    @Test
    public void example2() {
        int[] nums = new int[]{1};
        int k = 1;

        int[] expected = nums;
        Assertions.assertEquals(expected, sut.topKFrequent(nums, k));
    }
}