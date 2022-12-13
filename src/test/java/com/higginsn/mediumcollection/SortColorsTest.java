package com.higginsn.mediumcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortColorsTest {

    private final SortColors sut = new SortColors();

    @Test
    public void example1() {
        int[] actual = new int[]{2, 0, 2, 1, 1, 0};
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};

        sut.sortColors(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] actual = new int[]{2, 0, 1};
        int[] expected = new int[]{0, 1, 2};

        sut.sortColors(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}