package com.higginsn.mediumcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPeakElementTest {

    private final FindPeakElement sut = new FindPeakElement();

    @Test
    public void example1() {
        int[] nums = new int[]{1, 2, 3, 1};
        int expected = 2;

        Assertions.assertEquals(expected, sut.findPeakElement(nums));
    }

    @Test
    public void example2() {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        int peakOne = 1;
        int peakTwo = 5;

        int actual = sut.findPeakElement(nums);
        Assertions.assertTrue(peakOne == actual || peakTwo == actual);
    }

}