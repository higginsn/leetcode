package com.higginsn.amazon.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class WordLadderIITest {

    private final WordLadderII sut = new WordLadderII();

    @Test
    public void example1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        List<List<String>> expected = List.of(List.of("hit", "hot", "dot", "dog", "cog"),
                List.of("hit", "hot", "lot", "log", "cog"));
        Assertions.assertEquals(expected, sut.findLadders(beginWord, endWord, wordList));
    }

    @Test
    public void example2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log");

        List<List<String>> expected = List.of();
        Assertions.assertEquals(expected, sut.findLadders(beginWord, endWord, wordList));
    }

}