package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree sut = new BalancedBinaryTree();

    @Test
    public void example1() {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode root = new TreeNode(3, nine, twenty);

        Assertions.assertTrue(sut.isBalanced(root));
    }

    @Test
    public void example2() {
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3, four, four);
        TreeNode threeLeaf = new TreeNode(3);

        TreeNode two = new TreeNode(2, three, threeLeaf);
        TreeNode twoLeaf = new TreeNode(2);

        TreeNode root = new TreeNode(1, two, twoLeaf);

        Assertions.assertFalse(sut.isBalanced(root));
    }

    @Test
    public void example3() {
        Assertions.assertTrue(sut.isBalanced(null));
    }

}