package com.higginsn.mediumcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {

    private final SetMatrixZeroes sut = new SetMatrixZeroes();

    @Test
    public void example1() {
        int[][] actual = new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 0, 1},
                new int[]{1, 1, 1}
        };
        int[][] expected = new int[][]{
                new int[]{1, 0, 1},
                new int[]{0, 0, 0},
                new int[]{1, 0, 1}
        };

        sut.setZeroes(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[][] actual = new int[][]{
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5}
        };
        int[][] expected = new int[][]{
                new int[]{0, 0, 0, 0},
                new int[]{0, 4, 5, 0},
                new int[]{0, 3, 1, 0}
        };

        sut.setZeroes(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}