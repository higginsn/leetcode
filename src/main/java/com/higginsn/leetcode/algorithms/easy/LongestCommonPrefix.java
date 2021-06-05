package com.higginsn.leetcode.algorithms.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int minStrLength = Integer.MAX_VALUE;
        StringBuilder builder = new StringBuilder();

        // Precomputing the min length isn't necessary, if you just handle out of bounds indexing
        // or validate string lengths and break within the loop.
        for (String str : strs) {
            minStrLength = Math.min(minStrLength, str.length());
        }

        for (int i = 0; i < minStrLength; i++) {
            int finalI = i;
            List<Character> chars = Arrays.stream(strs)
                    .map(str -> str.charAt(finalI))
                    .distinct()
                    .collect(Collectors.toList());

            if (chars.size() != 1) {
                return builder.toString();
            }

            builder.append(chars.get(0));
        }

        return builder.toString();
    }

}
