package com.higginsn.leetcode.algorithms.google.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WordLadderTest {

    private final WordLadder sut = new WordLadder();

    @Test
    public void example1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        int expected = 5;
        Assertions.assertEquals(expected, sut.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void example2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dog", "dog", "lot", "log");

        int expected = 0;
        Assertions.assertEquals(expected, sut.ladderLength(beginWord, endWord, wordList));
    }

}