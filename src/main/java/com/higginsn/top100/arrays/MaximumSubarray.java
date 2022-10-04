package com.higginsn.top100.arrays;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSubArray = nums[0];
        int runningSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum = Math.max(nums[i], nums[i] + runningSum);
            maxSubArray = Math.max(maxSubArray, runningSum);
            if (runningSum < 0) {
                runningSum = 0;
            }

        }
        return maxSubArray;
    }

}
