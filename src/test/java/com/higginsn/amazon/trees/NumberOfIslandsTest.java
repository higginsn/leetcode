package com.higginsn.amazon.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {

    private final NumberOfIslands sut = new NumberOfIslands();

    @Test
    public void example1() {
        char[][] grid = new char[][]{
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'}
        };
        int expected = 1;

        Assertions.assertEquals(expected, sut.numIslands(grid));
    }

    @Test
    public void example2() {
        char[][] grid = new char[][]{
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '1', '0', '0'},
                new char[]{'0', '0', '0', '1', '1'}
        };
        int expected = 3;

        Assertions.assertEquals(expected, sut.numIslands(grid));
    }

}