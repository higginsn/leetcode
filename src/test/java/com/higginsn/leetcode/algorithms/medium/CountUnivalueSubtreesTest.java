package com.higginsn.leetcode.algorithms.medium;

import com.higginsn.leetcode.algorithms.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountUnivalueSubtreesTest {

    private static final TreeNode FIVE_LEAF = new TreeNode(5);

    private final CountUnivalueSubtrees sut = new CountUnivalueSubtrees();

    @Test
    public void example1() {
        TreeNode one = new TreeNode(1, FIVE_LEAF, FIVE_LEAF);
        TreeNode five = new TreeNode(5, null, FIVE_LEAF);
        TreeNode root = new TreeNode(5, one, five);
        int expected = 4;

        Assertions.assertEquals(expected, sut.countUnivalSubtrees(root));
    }

    @Test
    public void example2() {
        TreeNode root = null;
        int expected = 0;

        Assertions.assertEquals(expected, sut.countUnivalSubtrees(root));
    }

    @Test
    public void example3() {
        TreeNode fiveLeftChild = new TreeNode(5, FIVE_LEAF, FIVE_LEAF);
        TreeNode fiveRightChild = new TreeNode(5, null, FIVE_LEAF);
        TreeNode root = new TreeNode(5, fiveLeftChild, fiveRightChild);
        int expected = 6;

        Assertions.assertEquals(expected, sut.countUnivalSubtrees(root));
    }

}