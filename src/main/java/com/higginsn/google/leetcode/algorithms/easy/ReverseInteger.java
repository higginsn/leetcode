package com.higginsn.google.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
 * signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {

    /**
     * @param x - just an int
     * @return x, but its digits reversed. 0 if reversed number exceeds 32-bits.
     */
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }

        int result = 0;
        while (x > 0) {
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return isNegative ? -result : result;
    }

    /**
     * Alternate approach using a string builder. It's much more expensive than just computing the new number though.
     */
    private int reverseWithStringBuilder(int x) {
        String reversedInput = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(reversedInput);
        } catch (Exception e) {
            return 0;
        }
    }

}
