package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeZigzagLevelOrderTraversalTest {

    private BinaryTreeZigzagLevelOrderTraversal sut = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void example1() {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode root = new TreeNode(3, nine, twenty);

        List<List<Integer>> expected = List.of(List.of(3), List.of(20, 9), List.of(15, 7));
        Assertions.assertEquals(expected, sut.zigzagLevelOrder(root));
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = List.of(List.of(1));
        Assertions.assertEquals(expected, sut.zigzagLevelOrder(root));
    }

    @Test
    public void example3() {
        List<List<Integer>> expected = List.of();
        Assertions.assertEquals(expected, sut.zigzagLevelOrder(null));
    }

    @Test
    public void example4() {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        TreeNode two = new TreeNode(2, four, null);
        TreeNode three = new TreeNode(3, null, five);

        TreeNode root = new TreeNode(1, two, three);

        List<List<Integer>> expected = List.of(List.of(1), List.of(3, 2), List.of(4, 5));
        Assertions.assertEquals(expected, sut.zigzagLevelOrder(root));
    }

}