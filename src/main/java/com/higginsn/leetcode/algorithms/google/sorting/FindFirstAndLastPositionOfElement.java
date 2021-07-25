package com.higginsn.leetcode.algorithms.google.sorting;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class FindFirstAndLastPositionOfElement {

    private static final int[] DEFAULT_RESULT = new int[]{-1, -1};

    private int[] nums;
    private int target;

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return DEFAULT_RESULT;
        }

        this.nums = nums;
        this.target = target;

        int validIndex = searchRangeRecursively(0, nums.length - 1);

        if (validIndex == -1) {
            return DEFAULT_RESULT;
        }

        int leftIndex = validIndex;
        while (leftIndex > 0 && nums[leftIndex - 1] == target) {
            leftIndex--;
        }

        int rightIndex = validIndex;
        while (rightIndex < nums.length - 1 && nums[rightIndex + 1] == target) {
            rightIndex++;
        }

        return new int[]{leftIndex, rightIndex};

    }

    private int searchRangeRecursively(int left, int right) {
        if (left > right) {
            return -1;
        }

        int pivot = left + (right - left) / 2;
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[pivot] > target) {
            return searchRangeRecursively(left, pivot - 1);
        } else {
            return searchRangeRecursively(pivot + 1, right);
        }
    }

}
