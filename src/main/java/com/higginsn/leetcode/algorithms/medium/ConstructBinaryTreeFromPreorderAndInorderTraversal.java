package com.higginsn.leetcode.algorithms.medium;

import com.higginsn.leetcode.algorithms.models.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder
 * is the inorder traversal of the same tree, construct and return the binary tree.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    int preorderIndex;
    int[] preorder;
    Map<Integer, Integer> mapOfInorderValuesToIndexes = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorderIndex = 0;
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            mapOfInorderValuesToIndexes.put(inorder[i], i);
        }

        return buildTreeHelper(0, preorder.length - 1);
    }

    private TreeNode buildTreeHelper(int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }

        int value = preorder[preorderIndex++];
        int inorderIndex = mapOfInorderValuesToIndexes.get(value);

        TreeNode leftNode = buildTreeHelper(leftIndex, inorderIndex - 1);
        TreeNode rightNode = buildTreeHelper(inorderIndex + 1, rightIndex);
        return new TreeNode(value, leftNode, rightNode);
    }

}
