package com.higginsn.leetcode.algorithms.easy;

import com.higginsn.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    private final PathSum sut = new PathSum();

    @Test
    public void example1() {
        TreeNode seven = new TreeNode(7);
        TreeNode thirteen = new TreeNode(13);
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1);
        TreeNode eleven = new TreeNode(11, seven, two);
        TreeNode fourLeft = new TreeNode(4, eleven, null);
        TreeNode fourRight = new TreeNode(4, null, one);
        TreeNode eight = new TreeNode(8, thirteen, fourRight);
        TreeNode root = new TreeNode(5, fourLeft, eight);
        int expected = 22;

        Assertions.assertTrue(sut.hasPathSum(root, expected));
    }

    @Test
    public void example2() {
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode root = new TreeNode(1, two, three);
        int expected = 5;

        Assertions.assertFalse(sut.hasPathSum(root, expected));
    }

    @Test
    public void example3() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, two, null);
        int expected = 0;

        Assertions.assertFalse(sut.hasPathSum(root, expected));
    }

    @Test
    public void example4() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, two, null);
        int expected = 1;

        Assertions.assertFalse(sut.hasPathSum(root, expected));
    }

}