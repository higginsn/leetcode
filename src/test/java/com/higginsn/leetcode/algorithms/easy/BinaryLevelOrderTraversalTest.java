package com.higginsn.leetcode.algorithms.easy;

import com.higginsn.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class BinaryLevelOrderTraversalTest {

    private final BinaryLevelOrderTraversal sut = new BinaryLevelOrderTraversal();

    @Test
    public void multipleChildrenExpectBFS() {
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode root = new TreeNode(3, nine, twenty);

        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        Assertions.assertEquals(expected, sut.levelOrder(root));
    }

    @Test
    public void singleNodeInTreeExpectBFS() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> expected = List.of(List.of(1));
        Assertions.assertEquals(expected, sut.levelOrder(root));
    }

    @Test
    public void emptyTreeExpectEmptyList() {
        TreeNode root = null;
        List<List<Integer>> expected = Collections.emptyList();
        Assertions.assertEquals(expected, sut.levelOrder(root));
    }

}