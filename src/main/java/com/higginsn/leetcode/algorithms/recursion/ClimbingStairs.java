package com.higginsn.leetcode.algorithms.recursion;

/**
 * https://leetcode.com/problems/climbing-stairs/submissions/
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;
        int result = first + second;
        for (int i = 3; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }

}
