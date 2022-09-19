package com.higginsn.google.leetcode.algorithms.google.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestUniqueSubstring {

    /**
     * @param s - an arbitrary string of characters
     * @return length of longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int substring = 0;
            Set<Character> usedChars = new HashSet<>();
            while (j < s.length() && !usedChars.contains(s.charAt(j))) {
                usedChars.add(s.charAt(j));
                substring++;
                j++;
            }
            maxLength = Math.max(maxLength, substring);
        }

        return maxLength;
    }

}
