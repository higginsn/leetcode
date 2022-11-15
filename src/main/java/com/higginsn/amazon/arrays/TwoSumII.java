package com.higginsn.amazon.arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int beginIndex = 0;
        int endIndex = numbers.length - 1;

        while (beginIndex < endIndex) {
            int sum = numbers[beginIndex] + numbers[endIndex];
            if (sum == target) {
                break;
            } else if (sum < target) {
                beginIndex++;
            } else {
                endIndex--;
            }
        }

        return new int[]{beginIndex + 1, endIndex + 1};
    }
}
