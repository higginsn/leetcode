package com.higginsn.google.leetcode.algorithms.google.trees;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree
 */
public class DiameterOfBinaryTree {

    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //Compute diameter through this node
        int leftPath = dfs(root.left);
        int rightPath = dfs(root.right);
        result = Math.max(result, leftPath + rightPath);

        return Math.max(leftPath, rightPath) + 1;
    }

}
