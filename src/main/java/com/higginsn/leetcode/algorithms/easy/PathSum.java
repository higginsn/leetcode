package com.higginsn.leetcode.algorithms.easy;

import com.higginsn.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/problems/path-sum/
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals targetSum. A leaf is a node with no children.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int currentSum) {
        if (root == null) {
            return false;
        }

        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == targetSum;
        }
        return hasPathSum(root.left, targetSum, currentSum) || hasPathSum(root.right, targetSum, currentSum);
    }

}
