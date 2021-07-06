package com.higginsn.leetcode.algorithms.easy;

import com.higginsn.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Given the root of a binary tree, return its maximum depth. A binary tree's maximum depth is the number of nodes along
 * the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return maxDepthHelper(root, 1);
    }

    private int maxDepthHelper(TreeNode root, int currentDepth) {
        int leftMax = currentDepth;
        if (root.left != null) {
            leftMax = maxDepthHelper(root.left, currentDepth + 1);
        }

        int rightMax = currentDepth;
        if (root.right != null) {
            rightMax = maxDepthHelper(root.right, currentDepth + 1);
        }

        return Math.max(leftMax, rightMax);
    }

}
