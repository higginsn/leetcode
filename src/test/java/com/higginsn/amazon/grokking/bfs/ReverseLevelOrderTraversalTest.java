package com.higginsn.amazon.grokking.bfs;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ReverseLevelOrderTraversalTest {

    @Test
    public void example1() {
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, six, seven);

        TreeNode root = new TreeNode(1, two, three);
        List<List<Integer>> expected = List.of(
                List.of(4, 5, 6, 7),
                List.of(2, 3),
                List.of(1)
        );

        Assertions.assertEquals(expected, ReverseLevelOrderTraversal.traverse(root));
    }

    @Test
    public void example2() {
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);
        TreeNode five = new TreeNode(5);

        TreeNode seven = new TreeNode(7, null, nine);
        TreeNode one = new TreeNode(1, ten, five);

        TreeNode root = new TreeNode(12, seven, one);
        List<List<Integer>> expected = List.of(
                List.of(9, 10, 5),
                List.of(7, 1),
                List.of(12)
        );

        Assertions.assertEquals(expected, ReverseLevelOrderTraversal.traverse(root));
    }
}