package com.higginsn.amazon.grokking.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/gxk639mrr5r
 */
public class TripletSumToZero {

    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length && arr[i] <= 0; i++) {
            if (i == 0 || arr[i - 1] != arr[i]) {
                twoSum(arr, i, triplets);
            }
        }

        return triplets;
    }

    private static void twoSum(int[] arr, int i, List<List<Integer>> triplets) {
        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right] + arr[i];
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
            }
        }
    }

}
