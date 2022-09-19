package com.higginsn.google.leetcode.algorithms.google.interview;

/**
 * https://leetcode.com/explore/interview/card/google/67/sql-2/3046/
 */
public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {
        if (fruits.length < 2) {
            return fruits.length;
        }

        int result = 0;
        for (int i = 0; i < fruits.length - 1; i++) {
            int firstFruit = fruits[i];
            Integer secondFruit = null;
            int counter = 1;
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[j] == firstFruit) {
                    counter++;
                } else if (secondFruit == null) {
                    secondFruit = fruits[j];
                    counter++;
                } else if (fruits[j] == secondFruit) {
                    counter++;
                } else {
                    break;
                }
            }
            result = Math.max(result, counter);
        }

        return result;
    }

}
