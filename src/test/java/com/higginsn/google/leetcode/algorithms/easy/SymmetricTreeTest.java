package com.higginsn.google.leetcode.algorithms.easy;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    private final SymmetricTree sut = new SymmetricTree();

    @Test
    public void fullSymmetricTreeExpectSymmetric() {
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode twoLeft = new TreeNode(2, three, four);
        TreeNode twoRight = new TreeNode(2, four, three);
        TreeNode root = new TreeNode(1, twoLeft, twoRight);

        Assertions.assertTrue(sut.isSymmetric(root));
    }

    @Test
    public void childrenNotMirroredExpectNotSymmetric() {
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, null, three);
        TreeNode root = new TreeNode(1, two, two);

        Assertions.assertFalse(sut.isSymmetric(root));
    }

}