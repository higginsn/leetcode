package com.higginsn.leetcode.algorithms.medium;

import com.higginsn.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private final ConstructBinaryTreeFromInorderAndPostorderTraversal sut =
            new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    public void example1() {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};

        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode expected = new TreeNode(3, nine, twenty);
        Assertions.assertEquals(expected, sut.buildTree(inorder, postorder));
    }

    @Test
    public void example2() {
        int[] inorder = new int[]{-1};
        int[] postorder = new int[]{-1};

        TreeNode expected = new TreeNode(-1, null, null);
        Assertions.assertEquals(expected, sut.buildTree(inorder, postorder));
    }

}