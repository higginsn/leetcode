package com.higginsn.google.leetcode.algorithms.google.dynamic;

/**
 * https://leetcode.com/problems/maximum-product-subarray
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = nums[0];

        int currentMax = nums[0];
        int currentMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int tempMax = Math.max(current, Math.max(currentMax * current, currentMin * current));
            currentMin = Math.min(current, Math.min(currentMin * current, currentMax * current));

            currentMax = tempMax;

            max = Math.max(currentMax, max);
        }
        return max;
    }

}
