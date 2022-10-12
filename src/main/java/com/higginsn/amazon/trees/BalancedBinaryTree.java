package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/description/
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int findDepth(TreeNode node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(findDepth(node.left), findDepth(node.right));
    }

}
