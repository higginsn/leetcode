package com.higginsn.amazon.grokking.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    public void example1() {
        int[] input = new int[]{2, 3, 3, 3, 6, 9, 9};
        int expected = 4;

        Assertions.assertEquals(expected, RemoveDuplicates.remove(input));
    }

    @Test
    public void example2() {
        int[] input = new int[]{2, 2, 2, 11};
        int expected = 2;

        Assertions.assertEquals(expected, RemoveDuplicates.remove(input));
    }
}