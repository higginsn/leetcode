package com.higginsn.google.leetcode.algorithms.easy;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree sut = new MaximumDepthOfBinaryTree();

    @Test
    public void example1() {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode root = new TreeNode(3, nine, twenty);

        int expected = 3;
        Assertions.assertEquals(expected, sut.maxDepth(root));
    }

    @Test
    public void example2() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, two);

        int expected = 2;
        Assertions.assertEquals(expected, sut.maxDepth(root));
    }

    @Test
    public void example3() {
        TreeNode root = null;

        int expected = 0;
        Assertions.assertEquals(expected, sut.maxDepth(root));
    }

    @Test
    public void example4() {
        TreeNode root = new TreeNode(0);

        int expected = 1;
        Assertions.assertEquals(expected, sut.maxDepth(root));
    }

}