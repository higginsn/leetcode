package com.higginsn.amazon.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class LetterCombinationsOfAPhoneNumberTest {

    private final LetterCombinationsOfAPhoneNumber sut = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void example1() {
        String digits = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        Assertions.assertEquals(expected, sut.letterCombinations(digits));
    }

    @Test
    public void example2() {
        String digits = "";
        Assertions.assertEquals(Collections.emptyList(), sut.letterCombinations(digits));
    }

    @Test
    public void example3() {
        String digits = "2";
        List<String> expected = Arrays.asList("a", "b", "c");

        Assertions.assertEquals(expected, sut.letterCombinations(digits));
    }

}