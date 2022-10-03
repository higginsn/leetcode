package com.higginsn.amazon.trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/2982/
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> remainingWords = new HashSet<>(wordList);

        if (!remainingWords.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            for (int i = queue.size(); i > 0; i--) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return depth;
                }

                List<String> neighbors = findNeighbors(word, remainingWords);
                for (String neighbor : neighbors) {
                    if (remainingWords.contains(neighbor)) {
                        remainingWords.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        return 0;
    }

    private List<String> findNeighbors(String node, Set<String> remainingWords) {
        List<String> neighbors = new ArrayList<>();
        char[] listOfChar = node.toCharArray();

        for (int i = 0; i < node.length(); i++) {
            char oldChar = listOfChar[i];

            for (char c = 'a'; c <= 'z'; c++) {
                listOfChar[i] = c;
                if (c == oldChar) {
                    // Skip repeating words to avoid infinite loop
                    continue;
                }

                String newWord = String.valueOf(listOfChar);
                if (remainingWords.contains(newWord)) {
                    neighbors.add(newWord);
                }
            }

            // Reset changed char before moving on to the next index
            listOfChar[i] = oldChar;
        }

        return neighbors;
    }

}
