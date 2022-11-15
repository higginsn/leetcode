package com.higginsn.amazon.grokking.twopointers;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/xog6q15W9GP
 */
public class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
        int beginIndex = 0;
        int endIndex = arr.length - 1;

        while (beginIndex < endIndex) {
            int sum = arr[beginIndex] + arr[endIndex];
            if (sum == targetSum) {
                break;
            } else if (sum < targetSum) {
                beginIndex++;
            } else {
                endIndex--;
            }
        }

        return new int[]{beginIndex, endIndex};
    }

}
