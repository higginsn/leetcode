package com.higginsn.top100.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater sut = new ContainerWithMostWater();

    @Test
    public void example1() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;

        Assertions.assertEquals(expected, sut.maxArea(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{1, 1};
        int expected = 1;

        Assertions.assertEquals(expected, sut.maxArea(input));
    }
}