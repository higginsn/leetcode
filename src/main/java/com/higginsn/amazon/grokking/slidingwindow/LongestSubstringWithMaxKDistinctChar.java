package com.higginsn.amazon.grokking.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/YQQwQMWLx80
 */
public class LongestSubstringWithMaxKDistinctChar {

    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;

        Map<Character, Integer> characterCounterMap = new HashMap<>();
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char newChar = str.charAt(windowEnd);
            characterCounterMap.put(newChar, characterCounterMap.getOrDefault(newChar, 0) + 1);

            while (characterCounterMap.size() > k) {
                char oldChar = str.charAt(windowStart);
                characterCounterMap.put(oldChar, characterCounterMap.get(oldChar) - 1);
                if (characterCounterMap.get(oldChar) == 0) {
                    characterCounterMap.remove(oldChar);
                }
                windowStart++;
            }
            result = Math.max(result, windowEnd - windowStart + 1);
        }

        return result;
    }

}
