package com.higginsn.top100.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    private final ContainsDuplicate sut = new ContainsDuplicate();

    @Test
    public void example1() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(sut.containsDuplicate(nums));
    }

    @Test
    public void example2() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(sut.containsDuplicate(nums));
    }

    @Test
    public void example3() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(sut.containsDuplicate(nums));
    }

}