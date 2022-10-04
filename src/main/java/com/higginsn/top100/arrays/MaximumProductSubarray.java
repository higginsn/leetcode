package com.higginsn.top100.arrays;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int currentMaxSubarray = nums[0];
        int currentMinSubarray = nums[0];
        int maxSubarray = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(currentMaxSubarray * nums[i], currentMinSubarray * nums[i]));
            currentMinSubarray = Math.min(nums[i], Math.min(currentMinSubarray * nums[i], currentMaxSubarray * nums[i]));
            currentMaxSubarray = tempMax;
            maxSubarray = Math.max(maxSubarray, currentMaxSubarray);
        }

        return maxSubarray;
    }

}
