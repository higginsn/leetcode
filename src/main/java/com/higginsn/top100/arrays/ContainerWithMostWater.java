package com.higginsn.top100.arrays;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        int maxArea = 0;
        while (leftIndex < rightIndex) {
            int newArea = (rightIndex - leftIndex) * Math.min(height[leftIndex], height[rightIndex]);
            maxArea = Math.max(maxArea, newArea);
            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }

}
