package com.higginsn.mediumcollection;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthSmallestElementInBSTTest {

    private final KthSmallestElementInBST sut = new KthSmallestElementInBST();

    @Test
    public void example1() {
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1, null, two);
        TreeNode four = new TreeNode(4);
        TreeNode root = new TreeNode(3, one, four);
        int k = 1;

        int expected = 1;
        Assertions.assertEquals(expected, sut.kthSmallest(root, k));
    }

    @Test
    public void example2() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2, one, null);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3, two, four);
        TreeNode six = new TreeNode(6);
        TreeNode root = new TreeNode(5, three, six);
        int k = 3;

        int expected = 3;
        Assertions.assertEquals(expected, sut.kthSmallest(root, k));
    }

}