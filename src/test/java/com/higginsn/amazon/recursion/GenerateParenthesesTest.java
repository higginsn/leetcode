package com.higginsn.amazon.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class GenerateParenthesesTest {

    private final GenerateParentheses sut = new GenerateParentheses();

    @Test
    public void example1() {
        int input = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");

        Assertions.assertEquals(expected, sut.generateParenthesis(input));
    }

    @Test
    public void example2() {
        int input = 1;
        List<String> expected = Collections.singletonList("()");

        Assertions.assertEquals(expected, sut.generateParenthesis(input));
    }

}