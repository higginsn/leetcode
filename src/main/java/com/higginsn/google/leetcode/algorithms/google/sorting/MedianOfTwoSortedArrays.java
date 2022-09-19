package com.higginsn.google.leetcode.algorithms.google.sorting;

/**
 * https://leetcode.com/explore/featured/card/google/63/sorting-and-searching-4/3080/
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // [1, 3, 5], [2, 4, 6, 8]
        // 7 total elements, median = 4
        // 8 total elements, median = 5;
        int numberElements = nums1.length + nums2.length;
        int medianNumber = numberElements / 2 + 1;

        int leftIndex = 0;
        int rightIndex = 0;
        int counter = 0;
        Integer prevValue = null;
        Integer curValue = null;
        // counter = 2, left = 1, right = 2
        while (counter != medianNumber && leftIndex < nums1.length
                && rightIndex < nums2.length) {
            counter++;
            if (nums1[leftIndex] < nums2[rightIndex]) {
                prevValue = curValue;
                curValue = nums1[leftIndex++];
            } else {
                prevValue = curValue;
                curValue = nums2[rightIndex++];
            }
        }

        while (counter != medianNumber && leftIndex == nums1.length) {
            counter++;
            prevValue = curValue;
            curValue = nums2[rightIndex++];
        }
        while (counter != medianNumber && rightIndex == nums2.length) {
            counter++;
            prevValue = curValue;
            curValue = nums1[leftIndex++];
        }

        if (numberElements % 2 == 1) {
            return curValue;
        }

        return (curValue + prevValue) / 2.0;
    }

}
