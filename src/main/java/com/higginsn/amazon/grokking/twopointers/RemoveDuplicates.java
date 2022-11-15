package com.higginsn.amazon.grokking.twopointers;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/mEEA22L5mNA
 */
public class RemoveDuplicates {

    public static int remove(int[] arr) {
        int beginIndex = 0;
        int endIndex = 0;
        int result = 1;

        while (endIndex < arr.length) {
            if (arr[beginIndex] == arr[endIndex]) {
                endIndex++;
                continue;
            }

            beginIndex++;
            arr[beginIndex] = arr[endIndex];
            result++;
            endIndex++;

        }

        return result;
    }
}
