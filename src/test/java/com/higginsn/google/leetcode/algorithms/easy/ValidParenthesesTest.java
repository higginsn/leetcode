package com.higginsn.google.leetcode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    private final ValidParentheses sut = new ValidParentheses();

    @Test
    public void example1() {
        String input = "{}";
        Assertions.assertTrue(sut.isValid(input));
    }

    @Test
    public void example2() {
        String input = "()[]{}";
        Assertions.assertTrue(sut.isValid(input));
    }

    @Test
    public void example3() {
        String input = "(]";
        Assertions.assertFalse(sut.isValid(input));
    }

    @Test
    public void example4() {
        String input = "([)]";
        Assertions.assertFalse(sut.isValid(input));
    }

    @Test
    public void example5() {
        String input = "{[]}";
        Assertions.assertTrue(sut.isValid(input));
    }

    @Test
    public void isValidWithMoreOpenBracketsExpectInvalid() {
        String input = "((";
        Assertions.assertFalse(sut.isValid(input));
    }

    @Test
    public void isValidWithMoreClosingBracketsExpectInvalid() {
        String input = "})";
        Assertions.assertFalse(sut.isValid(input));
    }

}