package com.higginsn.top100.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

    private final InvertBinaryTree sut = new InvertBinaryTree();

    @Test
    public void example1() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode six = new TreeNode(6);
        TreeNode nine = new TreeNode(9);

        TreeNode two = new TreeNode(2, one, three);
        TreeNode seven = new TreeNode(7, six, nine);
        TreeNode root = new TreeNode(4, two, seven);

        TreeNode invertedSeven = new TreeNode(7, nine, six);
        TreeNode invertedTwo = new TreeNode(2, three, one);
        TreeNode invertedRoot = new TreeNode(4, invertedSeven, invertedTwo);

        Assertions.assertEquals(invertedRoot, sut.invertTree(root));
    }

    @Test
    public void example2() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode root = new TreeNode(2, one, three);

        TreeNode invertedRoot = new TreeNode(2, three, one);
        Assertions.assertEquals(invertedRoot, sut.invertTree(root));
    }

    @Test
    public void example3() {
        TreeNode root = new TreeNode();
        Assertions.assertEquals(root, sut.invertTree(root));
    }

}