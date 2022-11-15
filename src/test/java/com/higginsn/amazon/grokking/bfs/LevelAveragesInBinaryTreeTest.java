package com.higginsn.amazon.grokking.bfs;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LevelAveragesInBinaryTreeTest {

    @Test
    public void example1() {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, six, seven);

        TreeNode root = new TreeNode(1, two, three);
        List<Double> expected = List.of(1.0, 2.5, 5.5);

        Assertions.assertEquals(expected, LevelAveragesInBinaryTree.findLevelAverages(root));
    }

    @Test
    public void example2() {
        TreeNode nine = new TreeNode(9);
        TreeNode two = new TreeNode(2);
        TreeNode ten = new TreeNode(10);
        TreeNode five = new TreeNode(5);

        TreeNode seven = new TreeNode(7, nine, two);
        TreeNode one = new TreeNode(1, ten, five);

        TreeNode root = new TreeNode(12, seven, one);
        List<Double> expected = List.of(12.0, 4.0, 6.5);

        Assertions.assertEquals(expected, LevelAveragesInBinaryTree.findLevelAverages(root));
    }
}