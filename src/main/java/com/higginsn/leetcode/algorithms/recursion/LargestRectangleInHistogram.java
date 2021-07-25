package com.higginsn.leetcode.algorithms.recursion;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int length = heights.length;
        int maxArea = 0;
        for (int i = 0; i < length; i++) {
            while ((stack.peek() != -1)
                    && (heights[stack.peek()] >= heights[i])) {
                int currentHeight = heights[stack.pop()];
                int currentWidth = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currentHeight * currentWidth);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int currentHeight = heights[stack.pop()];
            int currentWidth = length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }
        return maxArea;
    }
//     public int largestRectangleArea(int[] heights) {
//         return findLargestArea(heights, 0, heights.length - 1);
//     }

//     private int findLargestArea(int[] heights, int left, int right) {
//         if (left > right) {
//             return 0;
//         }

//         int minIndex = findIndexOfMin(heights, left, right);
//         int max = heights[minIndex] * (heights.length);

//         max = Math.max(max, findLargestArea(heights, left, minIndex - 1));
//         max = Math.max(max, findLargestArea(heights, minIndex + 1, right));

//         return max;
//     }

//     private int findIndexOfMin(int[] heights, int left, int right) {
//         int minIndex = left;
//         for (int i = left; i <= right; i++) {
//             if (heights[i] < heights[minIndex]) {
//                 minIndex = i;
//             }
//         }

//         return minIndex;
//     }

}
