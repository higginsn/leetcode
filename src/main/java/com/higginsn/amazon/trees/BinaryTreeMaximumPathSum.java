package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/2981/
 */
public class BinaryTreeMaximumPathSum {

    private int maxSum = Integer.MIN_VALUE;

    // Given the root of a binary tree, this method returns the max path sum of any non-empty path.
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftPath = Math.max(helper(root.left), 0);
        int rightPath = Math.max(helper(root.right), 0);

        // new path
        int newPath = root.val + leftPath + rightPath;
        maxSum = Math.max(maxSum, newPath);
        return root.val + Math.max(leftPath, rightPath);
    }
}
