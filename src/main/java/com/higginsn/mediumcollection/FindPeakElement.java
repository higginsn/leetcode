package com.higginsn.mediumcollection;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/801/
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        return findPeakInBounds(nums, 0, nums.length - 1);
    }

    public int findPeakInBounds(int[] nums, int leftIndex, int rightIndex) {
        if (nums.length == 0) {
            return 0;
        }

        if (rightIndex <= leftIndex) {
            return leftIndex;
        }

        int median = (rightIndex + leftIndex) / 2;
        if (nums[median] > nums[median + 1]) {
            return findPeakInBounds(nums, leftIndex, median);
        } else {
            return findPeakInBounds(nums, median + 1, rightIndex);
        }
    }

}
