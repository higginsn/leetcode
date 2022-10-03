package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBSTTest {

    private ValidateBST sut = new ValidateBST();

    @Test
    public void example1() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode root = new TreeNode(2, one, three);

        Assertions.assertTrue(sut.isValidBST(root));
    }

    @Test
    public void example2() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode six = new TreeNode(6);

        TreeNode four = new TreeNode(4, three, six);
        TreeNode root = new TreeNode(5, one, four);

        Assertions.assertFalse(sut.isValidBST(root));
    }


}