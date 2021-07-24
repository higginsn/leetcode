package com.higginsn.leetcode.algorithms.google.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        while (!queue.isEmpty()) {
            depth++;

            int numberOfNodes = queue.size();
            for (int i = 0; i < numberOfNodes; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return depth;
                }

                List<String> variants = computeVariants(word);
                for (String variant : variants) {
                    mapOfVariantsToWords.getOrDefault(variant, new ArrayList<>())
                            .stream()
                            .filter(nextWord -> !visited.contains(nextWord))
                            .forEach(nextWord -> {
                                queue.offer(nextWord);
                                visited.add(nextWord);
                            });
                }
            }
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
