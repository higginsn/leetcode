package com.higginsn.explore.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestElementInAStreamTest {

    private KthLargestElementInAStream sut;

    @Test
    public void example1() {
        int[] nums = new int[]{4, 5, 8, 2};
        int k = 3;
        sut = new KthLargestElementInAStream(k, nums);

        Assertions.assertEquals(4, sut.add(3));
        Assertions.assertEquals(5, sut.add(5));
        Assertions.assertEquals(5, sut.add(10));
        Assertions.assertEquals(8, sut.add(9));
        Assertions.assertEquals(8, sut.add(4));
    }

}