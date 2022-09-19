package com.higginsn.google.leetcode.algorithms.easy;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class BinaryTreePreorderTraversalTest {

    private final BinaryTreePreorderTraversal sut = new BinaryTreePreorderTraversal();

    @Test
    public void multipleChildrenExpectChildrenReturnedAfterParent() {
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode root = new TreeNode(1, null, two);

        List<Integer> expected = List.of(1, 2, 3);
        Assertions.assertEquals(expected, sut.preorderTraversal(root));
    }

    @Test
    public void emptyTree() {
        TreeNode root = null;

        List<Integer> expected = Collections.emptyList();
        Assertions.assertEquals(expected, sut.preorderTraversal(root));
    }

    @Test
    public void rootNodeWithoutChildren() {
        TreeNode root = new TreeNode(1);

        List<Integer> expected = Collections.singletonList(1);
        Assertions.assertEquals(expected, sut.preorderTraversal(root));
    }

    @Test
    public void rootNodeWithLeftChildExpectChildReturnedAfterRoot() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, two, null);

        List<Integer> expected = List.of(1, 2);
        Assertions.assertEquals(expected, sut.preorderTraversal(root));
    }

    @Test
    public void rootNodeWithRightChildExpectRootReturnedBeforeChild() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, two);

        List<Integer> expected = List.of(1, 2);
        Assertions.assertEquals(expected, sut.preorderTraversal(root));
    }

}