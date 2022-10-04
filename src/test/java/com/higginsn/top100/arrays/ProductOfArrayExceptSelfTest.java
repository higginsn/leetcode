package com.higginsn.top100.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf sut = new ProductOfArrayExceptSelf();

    @Test
    public void example1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};

        Assertions.assertArrayEquals(expected, sut.productExceptSelf(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{-1, 1, 0, -3, 3};
        int[] expected = new int[]{0, 0, 9, 0, 0};

        Assertions.assertArrayEquals(expected, sut.productExceptSelf(input));
    }

}