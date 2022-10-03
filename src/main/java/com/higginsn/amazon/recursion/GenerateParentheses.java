package com.higginsn.amazon.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/amazon/84/recursion/2988/
 */
public class GenerateParentheses {

    private List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        helper(stringBuilder, 0, 0, n);
        return result;
    }

    private void helper(StringBuilder current, int openParen, int closedParen, int max) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (openParen < max ) { // there's room for another open paren
            current.append("(");
            helper(current, openParen + 1, closedParen, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (closedParen < openParen) { // there's room to close an open paren
            current.append(")");
            helper(current, openParen, closedParen + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }

}
