package com.higginsn.google.leetcode.algorithms.google.arrays;

/**
 * https://leetcode.com/explore/interview/card/google/59/array-and-strings/3052/
 */
public class RotateImage {

    private int[][] matrix;

    public void rotate(int[][] matrix) {
        this.matrix = matrix;

        transpose();
        reflect();
    }

    private void transpose() {
        // loop across the diagonals
        for (int i = 0; i < matrix.length; i++) {
            int j = i + 1;
            while (j < matrix.length) {
                swap(i, j, j, i);
                j++;
            }
        }
    }

    private void reflect() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                swap(i, j, i, matrix.length - 1 - j);
            }
        }
    }

    private void swap(int row1, int col1, int row2, int col2) {
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }

}
