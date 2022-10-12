package com.higginsn.top100.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence sut = new LongestConsecutiveSequence();

    @Test
    public void example1() {
        int[] input = new int[]{100, 4, 200, 1, 3, 2};
        int expected = 4;

        Assertions.assertEquals(expected, sut.longestConsecutive(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;

        Assertions.assertEquals(expected, sut.longestConsecutive(input));
    }
}