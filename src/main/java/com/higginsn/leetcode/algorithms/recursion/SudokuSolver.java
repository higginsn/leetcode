package com.higginsn.leetcode.algorithms.recursion;

public class SudokuSolver {

    private char[][] board;
    private int gridSize;
    private boolean solved = false;

    public void solveSudoku(char[][] board) {
        this.board = board;
        this.gridSize = board.length;
        backtrack(0, 0);
    }

    private void backtrack(int row, int col) {
        if (board[row][col] != '.') {
            continueToNextNumber(row, col);
            return;
        }

        for (char value = '1'; value <= '9'; value++) {
            if (!isValid(row, col, value)) {
                continue;
            }

            board[row][col] = value;
            continueToNextNumber(row, col);
            if (!solved) {
                board[row][col] = '.';
            }
        }

    }

    private void continueToNextNumber(int row, int col) {
        if (row == gridSize - 1 && col == gridSize - 1) {
            solved = true;
            return;
        }

        if (col == gridSize - 1) {
            // Go to next row
            backtrack(row + 1, 0);
        } else {
            backtrack(row, col + 1);
        }
    }

    private boolean isValid(int row, int col, char value) {
        return isValidRow(row, col, value)
                && isValidCol(row, col, value)
                && isValidSquare(row, col, value);
    }

    private boolean isValidRow(int row, int col, char value) {
        for (int i = 0; i < gridSize; i++) {
            if (i == col) {
                continue;
            }

            if (board[row][i] == value) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidCol(int row, int col, char value) {
        for (int i = 0; i < gridSize; i++) {
            if (i == row) {
                continue;
            }

            if (board[i][col] == value) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidSquare(int row, int col, char value) {
        int rowMultiplier = row / 3; // if row == 5, mult = 1
        int colMultiplier = col / 3; // if col == 5, mult = 1

        for (int i = rowMultiplier * 3; i < (rowMultiplier + 1) * 3; i++) {
            for (int j = colMultiplier * 3; j < (colMultiplier + 1) * 3; j++) {
                if (i == row && j == col) {
                    continue;
                }

                if (board[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

}
