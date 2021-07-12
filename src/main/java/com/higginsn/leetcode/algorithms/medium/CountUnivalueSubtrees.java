package com.higginsn.leetcode.algorithms.medium;

import com.higginsn.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/problems/count-univalue-subtrees/
 * Given the root of a binary tree, return the number of uni-value subtrees. A uni-value subtree means all nodes of the
 * subtree have the same value.
 */
public class CountUnivalueSubtrees {

    private int currentCount;

    public int countUnivalSubtrees(TreeNode root) {
        currentCount = 0;
        if (root == null) {
            return currentCount;
        }

        isUnivalSubtree(root);
        return currentCount;
    }

    private boolean isUnivalSubtree(TreeNode node) {
        if (node.left == null && node.right == null) {
            currentCount++;
            return true;
        }

        boolean isUnival = true;
        if (node.left != null) {
            isUnival = isUnivalSubtree(node.left) && isUnival && node.val == node.left.val;
        }
        if (node.right != null) {
            isUnival = isUnivalSubtree(node.right) && isUnival && node.val == node.right.val;
        }

        if (!isUnival) {
            return false;
        }

        currentCount++;
        return true;
    }

}
