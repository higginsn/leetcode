package com.higginsn.leetcode.algorithms.google.interview;

/**
 * https://leetcode.com/explore/interview/card/google/67/sql-2/472/
 */
public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        int counter = k;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '-') {
                continue;
            }

            if (counter == 0) {
                stringBuilder.append('-');
                counter = k;
            }

            stringBuilder.append(Character.toUpperCase(c));
            counter--;
        }

        return stringBuilder.reverse().toString();
    }

}
