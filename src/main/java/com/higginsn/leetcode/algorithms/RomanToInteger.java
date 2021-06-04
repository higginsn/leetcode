package com.higginsn.leetcode.algorithms;

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
            RomanNumeral romanNumeral = RomanNumeral.valueOf(s.charAt(i));
            RomanNumeral nextNumeral = RomanNumeral.valueOf(s.charAt(i + 1));

            if (romanNumeral.getValue() >= nextNumeral.getValue()) {
                result += romanNumeral.getValue();
            } else {
                result -= romanNumeral.getValue();
            }
        }

        result += RomanNumeral.valueOf(s.charAt(s.length() - 1)).getValue();
        return result;
    }

    private enum RomanNumeral {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public static RomanNumeral valueOf(char c) {
            return RomanNumeral.valueOf(String.valueOf(c));
        }

        public int getValue() {
            return this.value;
        }
    }

}
