package com.higginsn.google.leetcode.algorithms.recursion;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2944/
 */
public class MergeSort {

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int pivot = nums.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] right = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return mergeTwoSortedLists(left, right);
    }

    private int[] mergeTwoSortedLists(int[] l1, int[] l2) {
        if (l1.length == 0) {
            return l2;
        } else if (l2.length == 0) {
            return l1;
        }

        int left = 0;
        int right = 0;
        int[] result = new int[l1.length + l2.length];
        int resultPtr = 0;

        while(left != l1.length && right != l2.length) {
            if (l1[left] < l2[right]) {
                result[resultPtr] = l1[left];
                left++;
            } else {
                result[resultPtr] = l2[right];
                right++;
            }
            resultPtr++;
        }

        if (left == l1.length) {
            copyRemainingList(result, resultPtr, l2, right);
        } else {
            copyRemainingList(result, resultPtr, l1, left);
        }

        return result;
    }

    private void copyRemainingList(int[] result, int resultPtr, int[] list, int listPtr) {
        while (listPtr != list.length) {
            result[resultPtr++] = list[listPtr++];
        }
    }

}
