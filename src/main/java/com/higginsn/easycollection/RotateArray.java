package com.higginsn.easycollection;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
            left++;
            right--;
        }
    }

}
