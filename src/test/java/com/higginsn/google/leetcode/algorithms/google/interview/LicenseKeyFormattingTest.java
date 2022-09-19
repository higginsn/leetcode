package com.higginsn.google.leetcode.algorithms.google.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LicenseKeyFormattingTest {

    private final LicenseKeyFormatting sut = new LicenseKeyFormatting();

    @Test
    public void example1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String expected = "5F3Z-2e9w";

        Assertions.assertEquals(expected, sut.licenseKeyFormatting(s, k));
    }

    @Test
    public void example2() {
        String s = "2-5g-3-J";
        int k = 2;
        String expected = "2-5g-3J";

        Assertions.assertEquals(expected, sut.licenseKeyFormatting(s, k));
    }

}