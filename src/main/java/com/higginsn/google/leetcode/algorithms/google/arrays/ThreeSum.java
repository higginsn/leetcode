package com.higginsn.google.leetcode.algorithms.google.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

    private List<List<Integer>> result = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> threeSum(int[] nums) {
        this.nums = nums;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(i + 1, nums.length - 1, nums[i]);
            }
        }

        return result;
    }

    private void twoSum(int left, int right, int target) {
        if (left >= right) {
            return;
        }

        int sum = nums[left] + nums[right] + target;
        if (sum == 0) {
            result.add(List.of(nums[left], nums[right], target));
            left++;
            while (left < right && nums[left] == nums[left - 1]) {
                left++;
            }
            twoSum(left, right, target);
        } else if (sum < 0) {
            twoSum(left + 1, right, target);
        } else {
            twoSum(left, right - 1, target);

        }
    }

}
