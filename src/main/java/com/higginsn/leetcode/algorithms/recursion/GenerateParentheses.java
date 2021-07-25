package com.higginsn.leetcode.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/recursion-ii/503/recursion-to-iteration/2772/
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), n, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, int numOpen, int numClosed) {
        if (numOpen == 0 && numClosed == 0) {
            result.add(sb.toString());
            return;
        }


        if (numOpen > 0) {
            sb.append('(');
            backtrack(result, sb, numOpen - 1, numClosed);
            sb.setLength(sb.length() - 1);
        }

        if (numClosed > 0 && numClosed > numOpen) {
            sb.append(')');
            backtrack(result, sb, numOpen, numClosed - 1);
            sb.setLength(sb.length() - 1);
        }

    }

}
