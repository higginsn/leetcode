package com.higginsn.amazon.grokking.slidingwindow;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/7XMlMEQPnnQ
 */
public class SmallestSubArrayWithAGreaterSum {

    public static int findMinSubArray(int S, int[] arr) {
        int startIndex = 0;
        int endIndex = 0;

        int runningSum = 0;
        int minimumSubarraySize = Integer.MAX_VALUE;
        while (endIndex < arr.length) {
            runningSum += arr[endIndex];
            if (runningSum >= S) {
                while (runningSum >= S && startIndex <= endIndex) {
                    minimumSubarraySize = Math.min(minimumSubarraySize, endIndex - startIndex + 1);
                    runningSum -= arr[startIndex];
                    startIndex++;
                }
            }
            endIndex++;
        }

        return minimumSubarraySize;
    }

}
