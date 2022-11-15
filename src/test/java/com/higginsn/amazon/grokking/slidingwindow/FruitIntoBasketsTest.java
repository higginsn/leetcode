package com.higginsn.amazon.grokking.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FruitIntoBasketsTest {

    @Test
    public void example1() {
        char[] input = new char[]{'A', 'B', 'C', 'A', 'C'};
        int expected = 3;

        Assertions.assertEquals(expected, FruitIntoBaskets.findLength(input));
    }

    @Test
    public void example2() {
        char[] input = new char[]{'A', 'B', 'C', 'B', 'B', 'C'};
        int expected = 5;

        Assertions.assertEquals(expected, FruitIntoBaskets.findLength(input));
    }
}