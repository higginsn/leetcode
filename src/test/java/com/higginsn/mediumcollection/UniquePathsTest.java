package com.higginsn.mediumcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

    private final UniquePaths sut = new UniquePaths();

    @Test
    public void example1() {
        int m = 3;
        int n = 7;
        int expected = 28;

        Assertions.assertEquals(expected, sut.uniquePaths(m, n));
    }

    @Test
    public void example2() {
        int m = 3;
        int n = 2;
        int expected = 3;

        Assertions.assertEquals(expected, sut.uniquePaths(m, n));
    }

}