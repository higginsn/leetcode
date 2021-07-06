package com.higginsn.leetcode.algorithms.easy;

import com.higginsn.leetcode.algorithms.models.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Given the root of a binary tree, return the inorder traversal of its nodes' values
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        return result;
    }

    private void inorderTraversalHelper(TreeNode root, List<Integer> result) {
        if (root.left != null) {
            inorderTraversalHelper(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            inorderTraversalHelper(root.right, result);
        }
    }

}
