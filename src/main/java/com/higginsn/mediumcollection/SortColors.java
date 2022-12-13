package com.higginsn.mediumcollection;

import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/798/
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int numZeroes = 0;
        int numOnes = 0;

        for (int num : nums) {
            if (num == 0) {
                numZeroes++;
            } else if (num == 1) {
                numOnes++;
            }
        }

        IntStream.range(0, numZeroes).forEach(index -> nums[index] = 0);
        IntStream.range(numZeroes, numZeroes + numOnes).forEach(index -> nums[index] = 1);
        IntStream.range(numZeroes + numOnes, nums.length).forEach(index -> nums[index] = 2);
    }

}
