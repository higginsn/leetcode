package com.higginsn.leetcode.algorithms.google.arrays;

/**
 * https://leetcode.com/problems/next-permutation
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;

        // 1 3 2, left = 0, right = 2
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        if (left == -1) {
            reverseArray(0, nums);
            return;
        }

        int right = left + 1;
        while (right < nums.length && nums[left] < nums[right]) {
            right++;
        }
        right--;

        swap(nums, left, right);
        reverseArray(left + 1, nums);
    }

    private void reverseArray(int start, int[] nums) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
