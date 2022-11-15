package com.higginsn.amazon.grokking.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TripletSumToZeroTest {

    @Test
    public void example1() {
        int[] input = new int[]{-3, 0, 1, 2, -1, 1, -2};
        List<List<Integer>> expected = List.of(
                List.of(-3, 1, 2),
                List.of(-2, 0, 2),
                List.of(-2, 1, 1),
                List.of(-1, 0, 1)
        );

        Assertions.assertEquals(expected, TripletSumToZero.searchTriplets(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{-5, 2, -1, -2, 3};
        List<List<Integer>> expected = List.of(
                List.of(-5, 2, 3),
                List.of(-2, -1, 3)
        );

        Assertions.assertEquals(expected, TripletSumToZero.searchTriplets(input));
    }
}