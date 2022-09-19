package com.higginsn.google.leetcode.algorithms.google.trees;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeMaximumPathSumTest {

    private final BinaryTreeMaximumPathSum sut = new BinaryTreeMaximumPathSum();

    @Test
    public void example1() {
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode root = new TreeNode(1, two, three);
        int expected = 6;

        Assertions.assertEquals(expected, sut.maxPathSum(root));
    }

    @Test
    public void example2() {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode root = new TreeNode(-10, nine, twenty);
        int expected = 42;

        Assertions.assertEquals(expected, sut.maxPathSum(root));
    }

    @Test
    public void example3() {
        TreeNode root = new TreeNode(-3);
        int expected = -3;

        Assertions.assertEquals(expected, sut.maxPathSum(root));
    }

}