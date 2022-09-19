package com.higginsn.google.leetcode.algorithms.medium;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder
 * is the postorder traversal of the same tree, construct and return the binary tree.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private int postIndex;
    private int[] postorder;
    private final Map<Integer, Integer> mapOfInorderValueToIndex = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            mapOfInorderValueToIndex.put(inorder[i], i);
        }

        return buildTreeHelper(0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }

        int value = postorder[postIndex];
        int inorderIndex = mapOfInorderValueToIndex.get(value);

        postIndex--;
        TreeNode rightChild = buildTreeHelper(inorderIndex + 1, rightIndex);
        TreeNode leftChild = buildTreeHelper(leftIndex, inorderIndex - 1);

        return new TreeNode(value, leftChild, rightChild);
    }

}
