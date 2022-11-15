package com.higginsn.amazon.grokking.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/Bn2KLlOR0lQ
 */
public class FruitIntoBaskets {

    private static Map<Character, Integer> fruitCounterMap = new HashMap<>();

    public static int findLength(char[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int startWindow = 0;
        int maxFruits = 0;
        int currentFruits = 0;

        for (int endWindow = 0; endWindow < arr.length; endWindow++) {
            char nextFruit = arr[endWindow];
            currentFruits++;
            fruitCounterMap.put(nextFruit, fruitCounterMap.getOrDefault(nextFruit, 0) + 1);

            while (fruitCounterMap.size() > 2) {
                char oldFruit = arr[startWindow];
                fruitCounterMap.put(oldFruit, fruitCounterMap.get(oldFruit) - 1);
                if (fruitCounterMap.get(oldFruit) == 0) {
                    fruitCounterMap.remove(oldFruit);
                }
                currentFruits--;
            }
            maxFruits = Math.max(currentFruits, maxFruits);
        }

        return maxFruits;
    }

}
