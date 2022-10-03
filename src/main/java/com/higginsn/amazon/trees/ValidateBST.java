package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/514/
 */
public class ValidateBST {

    /**
     * Given the root of a binary tree, determine if it is valid. A valid BST has three properties:
     * 1. Left subtree of a node only contains nodes with keys <= the node's key
     * 2. Right subtree of a node only contains nodes with keys >= the node's key
     * 3. Both left and right subtrees must also be BSTs
     */
    public boolean isValidBST(TreeNode root) {
        return isSubtreeValid(root, null, null);
    }

    private boolean isSubtreeValid(TreeNode node, TreeNode left, TreeNode right) {
        if (node == null) {
            return true;
        }
        if ((left != null && node.val <= left.val) ||
                (right != null && node.val >= right.val)) {
            return false;
        }

        return isSubtreeValid(node.left, left, node)
                && isSubtreeValid(node.right, node, right);
    }

}
