package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/507/
 */
public class SymmetricTree {

    /**
     * Given the root of a binary tree, this method returns true if the tree is symmetric.
     */
    public boolean isSymmetric(TreeNode root) {
        // no validation needed on base node, except return early if it's null
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left != null && right != null
                && left.val != right.val) {
            return false;
        }

        if (left == null || right == null) {
            return left == right;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

}
