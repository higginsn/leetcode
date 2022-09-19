package com.higginsn.google.leetcode.algorithms.google.trees;

import java.util.List;

/**
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 */
public class LongestIncreasingPathInAMatrix {

    private static final List<int[]> DIRECTIONS = List.of(new int[]{-1, 0},
            new int[]{1, 0},
            new int[]{0, -1},
            new int[]{0, 1});

    private int[][] matrix;
    private int numRows;
    private int numCols;
    private int[][] visited;

    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        this.numRows = matrix.length;
        this.numCols = matrix[0].length;
        visited = new int[numRows][numCols];


        int longestIncreasingPath = 0;
        // Try DFS from any node
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int longestPathFound = dfs(i, j);
                longestIncreasingPath = Math.max(longestIncreasingPath, longestPathFound);
            }
        }


        return longestIncreasingPath;
    }

    private int dfs(int row, int col) {
        if (visited[row][col] != 0) {
            return visited[row][col];
        }

        int result = 0;

        for (int[] direction : DIRECTIONS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (isValidPosition(newRow, newCol) && matrix[newRow][newCol] > matrix[row][col]) {
                result = Math.max(result, dfs(newRow, newCol));
            }
        }
        ++result;
        visited[row][col] = result;
        return result;
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < numRows
                && col >= 0 && col < numCols;
    }


}
