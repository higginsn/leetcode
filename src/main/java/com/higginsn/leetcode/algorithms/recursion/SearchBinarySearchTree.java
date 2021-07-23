package com.higginsn.leetcode.algorithms.recursion;

import com.higginsn.leetcode.algorithms.models.TreeNode;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a
 * node does not exist, return null.
 */
public class SearchBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

}
