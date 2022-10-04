package com.higginsn.top100.arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];

        leftProducts[0] = 1;
        rightProducts[nums.length - 1] = 1;
        for (int leftIndex = 1; leftIndex < nums.length; leftIndex++){
            leftProducts[leftIndex] = leftProducts[leftIndex - 1] * nums[leftIndex - 1];
        }
        for (int rightIndex = nums.length - 2; rightIndex >= 0; rightIndex--) {
            rightProducts[rightIndex] = rightProducts[rightIndex + 1] * nums[rightIndex + 1];
        }

        int[] results = new int[nums.length];
        for (int i = 0; i < results.length; i++) {
            results[i] = leftProducts[i] * rightProducts[i];
        }
        return results;
    }

}
