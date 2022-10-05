package com.higginsn.amazon.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSearchTest {

    private final WordSearch sut = new WordSearch();

    @Test
    public void example1() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String word = "ABCCED";

        Assertions.assertTrue(sut.exist(board, word));
    }

    @Test
    public void example2() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String word = "SEE";

        Assertions.assertTrue(sut.exist(board, word));
    }

    @Test
    public void example3() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
        String word = "ABCB";

        Assertions.assertFalse(sut.exist(board, word));
    }

}