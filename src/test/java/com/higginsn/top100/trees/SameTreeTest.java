package com.higginsn.top100.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SameTreeTest {

    private final SameTree sut = new SameTree();

    @Test
    public void sameTreeWithChildrenExpectEquals() {
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode root = new TreeNode(1, two, three);

        Assertions.assertTrue(sut.isSameTree(root, root));
    }

    @Test
    public void sameValuesWithDifferentStructureExpectNotEquals() {
        TreeNode two = new TreeNode(2);
        TreeNode rootWithLeftChild = new TreeNode(1, two, null);
        TreeNode rootWithRightChild = new TreeNode(1, null, two);

        Assertions.assertFalse(sut.isSameTree(rootWithLeftChild, rootWithRightChild));
    }

    @Test
    public void sameStructureWithDifferentValuesExpectNotEquals() {
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode root1 = new TreeNode(1, two, three);
        TreeNode root2 = new TreeNode(1, three, two);

        Assertions.assertFalse(sut.isSameTree(root1, root2));
    }

    @Test
    public void firstTreeEmptyExpectNotEquals() {
        TreeNode root = new TreeNode(1);

        Assertions.assertFalse(sut.isSameTree(root, null));
    }

    @Test
    public void secondTreeEmptyExpectNotEquals() {
        TreeNode root = new TreeNode(1);

        Assertions.assertFalse(sut.isSameTree(null, root));
    }

    @Test
    public void bothTreesEmptyExpectEquals() {
        Assertions.assertTrue(sut.isSameTree(null, null));
    }


}