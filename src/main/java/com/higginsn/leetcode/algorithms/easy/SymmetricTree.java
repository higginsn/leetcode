package com.higginsn.leetcode.algorithms.easy;

import com.higginsn.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 * Given the root of a binary tree, chekc whether it is a mirror of itself (i.e., symmetric around its center)
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirroredTree(root.left, root.right);
    }

    private boolean isMirroredTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }

        if (p.val != q.val) {
            return false;
        }

        return isMirroredTree(p.left, q.right) && isMirroredTree(p.right, q.left);
    }

}
