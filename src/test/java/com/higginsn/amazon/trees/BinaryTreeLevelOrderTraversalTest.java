package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

    private BinaryTreeLevelOrderTraversal sut = new BinaryTreeLevelOrderTraversal();

    @Test
    public void example1() {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode root = new TreeNode(3, nine, twenty);

        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));

        Assertions.assertEquals(expected, sut.levelOrder(root));
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = List.of(List.of(1));

        Assertions.assertEquals(expected, sut.levelOrder(root));
    }

    @Test
    public void example3() {
        List<List<Integer>> expected = List.of();

        Assertions.assertEquals(expected, sut.levelOrder(null));
    }

}