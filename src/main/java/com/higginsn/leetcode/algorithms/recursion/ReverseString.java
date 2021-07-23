package com.higginsn.leetcode.algorithms.recursion;

/**
 * https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/
 * Write a function that reverses a string. The input string is given as an array of characters.
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        while (leftIndex < rightIndex) {
            char temp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }

}
