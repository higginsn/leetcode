package com.higginsn.top100.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtreeOfAnotherTreeTest {

    private final SubtreeOfAnotherTree sut = new SubtreeOfAnotherTree();

    @Test
    public void example1() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode subRoot = new TreeNode(4, one, two);
        TreeNode root = new TreeNode(3, subRoot, five);

        Assertions.assertTrue(sut.isSubtree(root, subRoot));
    }

    @Test
    public void example2() {
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2, zero, null);
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4, one, two);
        TreeNode root = new TreeNode(3, four, five);

        TreeNode subOne = new TreeNode(1);
        TreeNode subTwo = new TreeNode(2);
        TreeNode subRoot = new TreeNode(4, subOne, subTwo);

        Assertions.assertFalse(sut.isSubtree(root, subRoot));
    }
}