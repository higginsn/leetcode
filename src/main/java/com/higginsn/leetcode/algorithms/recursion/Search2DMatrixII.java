package com.higginsn.leetcode.algorithms.recursion;

/**
 * https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2874/
 */
public class Search2DMatrixII {

    private int[][] matrix;
    private int target;

    public boolean searchMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.target = target;

        if (matrix == null || matrix.length == 0) {
            return false;
        }

        return searchSubMatrix(0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    private boolean searchSubMatrix(int top, int bottom, int left, int right) {
        if (left > right || top > bottom) {
            // no area in submatrix
            return false;
        }

        if (matrix[top][left] > target) {
            return false;
        }

        if (matrix[bottom][right] < target) {
            return false;
        }

        int pivot = left + (right - left) / 2;
        int row = top;
        while (row <= bottom && matrix[row][pivot] <= target) {
            if (matrix[row][pivot] == target) {
                return true;
            }
            row++;
        }

        return searchSubMatrix(row, bottom, left, pivot - 1)
                || searchSubMatrix(top, row - 1, pivot + 1, right);

    }

}
