package com.higginsn.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/roman-to-integer/
 * Given a roman numeral (I, V, X, L, C, D, M), convert it to an integer.
 */
public class RomanToInteger {

    /**
     * @param s - a string of Roman numerals representing a number
     * @return the integer form of the supplied Roman numerals
     */
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int currentValue = convertToInt(s.charAt(i));
            int nextValue = convertToInt(s.charAt(i + 1));

            if (currentValue >= nextValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
        }

        return result + convertToInt(s.charAt(s.length() - 1));
    }

    private static int convertToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}
