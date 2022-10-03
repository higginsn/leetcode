package com.higginsn.amazon.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/amazon/84/recursion/521/
 */
public class LetterCombinationsOfAPhoneNumber {

    private static final Map<Character, List<Character>> mapOfDigitsToLetters = Map.of(
            '2', Arrays.asList('a', 'b', 'c'),
            '3', Arrays.asList('d', 'e', 'f'),
            '4', Arrays.asList('g', 'h', 'i'),
            '5', Arrays.asList('j', 'k', 'l'),
            '6', Arrays.asList('m', 'n', 'o'),
            '7', Arrays.asList('p', 'q', 'r', 's'),
            '8', Arrays.asList('t', 'u', 'v'),
            '9', Arrays.asList('w', 'x', 'y', 'z')
    );
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Collections.emptyList();
        }

        Queue<String> queue = new LinkedList();
        for (char digit : digits.toCharArray()) {
            if (queue.isEmpty()) {
                queue.addAll(mapOfDigitsToLetters.get(digit).stream()
                        .map(String::valueOf)
                        .collect(Collectors.toList()));
            } else {
                for (int i = queue.size(); i > 0; i--) {
                    String path = queue.poll();
                    queue.addAll(mapOfDigitsToLetters.get(digit).stream()
                            .map(c -> path + c)
                            .collect(Collectors.toList()));
                }
            }
        }
        return new ArrayList<>(queue);
    }

}
