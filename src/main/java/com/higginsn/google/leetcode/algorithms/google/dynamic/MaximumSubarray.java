package com.higginsn.google.leetcode.algorithms.google.dynamic;

/**
 * https://leetcode.com/problems/maximum-subarray
 */
public class MaximumSubarray {

    private int[] nums;

    public int maxSubArray(int[] nums) {
        this.nums = nums;
        return maxSubArray(0, nums.length - 1);
    }

    private int maxSubArray(int left, int right) {
        if (left > right) {
            return Integer.MIN_VALUE;
        }

        int pivot = (left + right) / 2;
        int current = 0;
        int maxLeft = 0;
        for (int i = pivot - 1; i >= left; i--) {
            current += nums[i];
            maxLeft = Math.max(current, maxLeft);
        }

        current = 0;
        int maxRight = 0;
        for (int i = pivot + 1; i <= right; i++) {
            current += nums[i];
            maxRight = Math.max(current, maxRight);
        }

        int currentMax = nums[pivot] + maxLeft + maxRight;

        int maxLeftHalf = maxSubArray(left, pivot - 1);
        int maxRightHalf = maxSubArray(pivot + 1, right);
        return Math.max(currentMax, Math.max(maxLeftHalf, maxRightHalf));
    }


}
