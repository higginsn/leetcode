package com.higginsn.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/palindrome-number/
 * Given an integer x, return true if x is a palindrome integer
 */
public class PalindromeNumber {

    /**
     * @param input - any integer
     * @return boolean representing if the given integer is a palindrome
     */
    public boolean isPalindrome(int input) {
        if (input < 0) {
            return false;
        }

        // int manipulation would be more efficient than casting to a string
        String str = Integer.toString(input);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() / 2; i++) {
            stack.add(str.charAt(i));
        }

        for (int i = (str.length() + 1) / 2; i < str.length(); i++) {
            char c = stack.pop();
            if (c != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
