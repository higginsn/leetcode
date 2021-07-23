package com.higginsn.leetcode.algorithms.google.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-ladder/
 * Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest
 * transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> mapOfVariantsToWords = new HashMap<>();
        wordList.forEach(word -> {
            List<String> variants = computeVariants(word);
            for (String variant : variants) {
                mapOfVariantsToWords.putIfAbsent(variant, new ArrayList<>());
                mapOfVariantsToWords.get(variant).add(word);
            }
        });

        int depth = 0;
        List<String> currentDepth = new ArrayList<>();
        currentDepth.add(beginWord);
        List<String> currentPath = new ArrayList<>();
        while (!currentDepth.isEmpty()) {
            depth++;

            List<String>
        }

        return 0;
    }

    private List<String> computeVariants(String string) {
        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.setCharAt(i, '*');
            result.add(stringBuilder.toString());
            stringBuilder.setCharAt(i, string.charAt(i));
        }
        return result;
    }

}
