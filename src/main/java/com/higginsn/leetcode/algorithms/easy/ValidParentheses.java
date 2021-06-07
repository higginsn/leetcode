package com.higginsn.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * Given a string s containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is
 * valid. An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpeningParenthesis(c)) {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char openParenthesis = stack.pop();
                if (!compareParentheses(openParenthesis, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpeningParenthesis(char c) {
        return c == '[' || c == '{' || c == '(';
    }

    private boolean compareParentheses(char open, char closed) {
        return (open == '(' && closed == ')')
                || (open == '[' && closed == ']')
                || (open == '{' && closed == '}');
    }

}
