package com.higginsn.easycollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray sut = new RemoveDuplicatesFromSortedArray();

    @Test
    public void example1() {
        int[] input = new int[]{1, 1, 2};
        int expected = 2;

        Assertions.assertEquals(expected, sut.removeDuplicates(input));
        int[] expectedArray = new int[]{1, 2};
        for (int i = 0; i < expectedArray.length; i++) {
            Assertions.assertEquals(expectedArray[i], input[i]);
        }
    }

    @Test
    public void example2() {
        int[] input = new int[]{1, 1, 2};
        int expected = 2;

        Assertions.assertEquals(expected, sut.removeDuplicates(input));
        int[] expectedArray = new int[]{1, 2};
        for (int i = 0; i < expectedArray.length; i++) {
            Assertions.assertEquals(expectedArray[i], input[i]);
        }
    }

}