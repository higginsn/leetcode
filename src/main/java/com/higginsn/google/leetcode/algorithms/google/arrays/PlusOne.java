package com.higginsn.google.leetcode.algorithms.google.arrays;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 0) {
            return new int[]{1};
        }

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                carry = 0;
                break;
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }

        if (carry == 1) {
            int[] temp = digits;
            digits = new int[digits.length + 1];
            digits[0] = 1;
            for (int i = 0; i < temp.length; i++) {
                digits[i + 1] = temp[i];
            }
        }

        return digits;
    }

}
