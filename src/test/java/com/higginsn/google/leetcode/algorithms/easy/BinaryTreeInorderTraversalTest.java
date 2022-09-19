package com.higginsn.google.leetcode.algorithms.easy;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal sut = new BinaryTreeInorderTraversal();

    @Test
    public void multipleChildrenExpectLeftChildReturnedBeforeItsParent() {
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode root = new TreeNode(1, null, two);

        List<Integer> expected = List.of(1, 3, 2);
        Assertions.assertEquals(expected, sut.inorderTraversal(root));
    }

    @Test
    public void emptyTree() {
        TreeNode root = null;

        List<Integer> expected = Collections.emptyList();
        Assertions.assertEquals(expected, sut.inorderTraversal(root));
    }

    @Test
    public void rootNodeWithoutChildren() {
        TreeNode root = new TreeNode(1);

        List<Integer> expected = Collections.singletonList(1);
        Assertions.assertEquals(expected, sut.inorderTraversal(root));
    }

    @Test
    public void rootNodeWithLeftChildExpectChildReturnedBeforeRoot() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, two, null);

        List<Integer> expected = List.of(2, 1);
        Assertions.assertEquals(expected, sut.inorderTraversal(root));
    }

    @Test
    public void rootNodeWithRightChildExpectRootReturnedAfterChild() {
        TreeNode two = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, two);

        List<Integer> expected = List.of(1, 2);
        Assertions.assertEquals(expected, sut.inorderTraversal(root));
    }

}