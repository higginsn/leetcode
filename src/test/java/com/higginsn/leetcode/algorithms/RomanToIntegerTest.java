package com.higginsn.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger sut = new RomanToInteger();

    @Test
    public void example1() {
        String input = "III";
        int expected = 3;
        assertEquals(expected, sut.romanToInt(input));
    }

    @Test
    public void example2() {
        String input = "IV";
        int expected = 4;
        assertEquals(expected, sut.romanToInt(input));
    }

    @Test
    public void example3() {
        String input = "IX";
        int expected = 9;
        assertEquals(expected, sut.romanToInt(input));
    }

    @Test
    public void example4() {
        String input = "LVIII";
        int expected = 58;
        assertEquals(expected, sut.romanToInt(input));
    }

    @Test
    public void example5() {
        String input = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected, sut.romanToInt(input));
    }

}