package com.higginsn.top100.graphs;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int result = 0;

        for (int num : nums) {
            if (set.contains(num - 1)) {
                // micro-optimization: only count from the start of a sequence
                continue;
            }

            int counter = num + 1;
            while (set.contains(counter)) {
                counter++;
            }
            int offset = counter - num;
            result = Math.max(result, offset);
        }

        return result;
    }

}
