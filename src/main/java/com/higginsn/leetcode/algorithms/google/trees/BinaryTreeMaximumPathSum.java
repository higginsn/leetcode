package com.higginsn.leetcode.algorithms.google.trees;

import com.higginsn.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/explore/interview/card/google/61/trees-and-graphs/3067/
 */
public class BinaryTreeMaximumPathSum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return maxSum;
    }

    private int maxPathSumHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftPathMax = Math.max(maxPathSumHelper(root.left), 0);
        int rightPathMax = Math.max(maxPathSumHelper(root.right), 0);
        int newPath = leftPathMax + rightPathMax + root.val;

        maxSum = Math.max(maxSum, newPath);

        return root.val + Math.max(leftPathMax, rightPathMax);
    }

}
