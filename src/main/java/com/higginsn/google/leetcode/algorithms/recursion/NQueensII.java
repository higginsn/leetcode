package com.higginsn.google.leetcode.algorithms.recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/n-queens-ii/submissions/
 */
public class NQueensII {

    private int size;

    public int totalNQueens(int n) {
        this.size = n;

        return backtrack(0, new HashSet<>(), new HashSet<>(), new HashSet<>());
    }

    private int backtrack(int row, Set<Integer> columns, Set<Integer> diagonals, Set<Integer> antiDiagonals) {
        if (row == size) {
            // This means we've successfully placed a queen in the last row already
            return 1;
        }

        int solutions = 0;
        for (int col = 0; col < size; col++) {
            int diag = row - col;
            int antiDiag = row + col;

            if (columns.contains(col) || diagonals.contains(diag)
                    || antiDiagonals.contains(antiDiag)) {
                // A queen can attack this square already
                continue;
            }

            columns.add(col);
            diagonals.add(diag);
            antiDiagonals.add(antiDiag);

            solutions += backtrack(row + 1, columns, diagonals, antiDiagonals);

            columns.remove(col);
            diagonals.remove(diag);
            antiDiagonals.remove(antiDiag);
        }

        return solutions;
    }

}
