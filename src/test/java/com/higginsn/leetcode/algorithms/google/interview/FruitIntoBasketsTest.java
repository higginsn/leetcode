package com.higginsn.leetcode.algorithms.google.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitIntoBasketsTest {

    private final FruitIntoBaskets sut = new FruitIntoBaskets();

    @Test
    public void example1() {
        int[] input = new int[]{ 0, 1, 2, 2 };
        int expected = 3;

        Assertions.assertEquals(expected, sut.totalFruit(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{ 1, 2, 3, 2, 2 };
        int expected = 4;

        Assertions.assertEquals(expected, sut.totalFruit(input));
    }

    @Test
    public void example3() {
        int[] input = new int[]{ 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        int expected = 5;

        Assertions.assertEquals(expected, sut.totalFruit(input));
    }

    @Test
    public void example4() {
        int[] input = new int[]{ 5, 0, 0, 7, 0, 7, 2, 7 };
        int expected = 5;

        Assertions.assertEquals(expected, sut.totalFruit(input));
    }

    @Test
    public void example5() {
        int[] input = new int[]{ 0 };
        int expected = 1;

        Assertions.assertEquals(expected, sut.totalFruit(input));
    }

}