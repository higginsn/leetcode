package com.higginsn.leetcode.algorithms.google.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-window-substring/
 */
public class MinimumSlidingWindow {

    private static final String DEFAULT_RESULT = "";
    private static final int[] DEFAULT_WINDOW = new int[]{-1, 0, 0};

    private Map<Character, Integer> mapOfTargetCounts = new HashMap<>();
    private Map<Character, Integer> mapOfWindowCounts = new HashMap<>();

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return DEFAULT_RESULT;
        }

        for (int i = 0; i < t.length(); i++) {
            int currentCounter = mapOfTargetCounts.getOrDefault(t.charAt(i), 0);
            mapOfTargetCounts.put(t.charAt(i), currentCounter + 1);
        }

        int left = 0;
        int right = 0;
        int formed = 0;
        int[] result = DEFAULT_WINDOW;
        int requiredUniqueCount = mapOfTargetCounts.size();

        while (right < s.length()) {
            // add character to window
            char c = s.charAt(right);
            int count = mapOfWindowCounts.getOrDefault(c, 0);
            mapOfWindowCounts.put(c, ++count);

            // check if this completes a character
            if (mapOfTargetCounts.get(c) != null && mapOfTargetCounts.get(c) == count) {
                formed++;
            }

            // Try to shorten the window until it becomes invalid again
            while (left <= right && formed == requiredUniqueCount) {
                c = s.charAt(left);

                // Store a snapshot of the best window
                if (result.equals(DEFAULT_WINDOW) || result[0] > right - left + 1) {
                    result = new int[]{right - left + 1, left, right};
                }

                count = mapOfWindowCounts.get(c);
                mapOfWindowCounts.put(c, --count);

                // Check if we removed a necessary part of the window
                if (mapOfTargetCounts.get(c) != null && mapOfTargetCounts.get(c) > count) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return Arrays.equals(result, DEFAULT_WINDOW) ? "" : s.substring(result[1], result[2] + 1);
    }

}
