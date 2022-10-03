package com.higginsn.amazon.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
 */

public class TwoSum {

    private Map<Integer, Integer> numMap = new HashMap<>();

    // nums is an int array of arbitrary numbers
    // target is the sum of two arbitrary integers in nums
    // return the indices of these two integers
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (numMap.containsKey(remainder)) {
                return new int[]{numMap.get(remainder), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }

}
