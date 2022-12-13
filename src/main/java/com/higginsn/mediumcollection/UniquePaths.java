package com.higginsn.mediumcollection;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/808/
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] visited = new int[m][n];
        visited[m - 1][n - 1] = 1;

        uniquePathsHelper(0, 0, visited);

        return visited[0][0];
    }

    public int uniquePathsHelper(int row, int col, int[][] visited) {
        if (row >= visited.length || col >= visited[0].length) {
            return 0;
        }

        if (visited[row][col] > 0) {
            return visited[row][col];
        }


        visited[row][col] = uniquePathsHelper(row + 1, col, visited) +
                uniquePathsHelper(row, col + 1, visited);

        return visited[row][col];
    }

}
