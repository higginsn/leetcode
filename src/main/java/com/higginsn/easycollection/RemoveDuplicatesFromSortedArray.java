package com.higginsn.easycollection;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int iterator = 0;
        int runner = 1;

        while (runner < nums.length) {
            if (nums[iterator] != nums[runner]) {
                iterator++;
                nums[iterator] = nums[runner];
            }
            runner++;
        }

        return iterator + 1;
    }

}
