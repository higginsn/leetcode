package com.higginsn.amazon.grokking.slidingwindow;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/JPKr0kqLGNP
 */
public class MaxSumSubArrayOfSizeK {

    public static int findMaxSumSubArray(int k, int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k) {
                sum -= arr[i - k];
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

}
