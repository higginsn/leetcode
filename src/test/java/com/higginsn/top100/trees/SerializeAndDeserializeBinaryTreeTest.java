package com.higginsn.top100.trees;

import com.higginsn.models.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SerializeAndDeserializeBinaryTreeTest {

    private final SerializeAndDeserializeBinaryTree sut = new SerializeAndDeserializeBinaryTree();

    @Test
    public void example1() {
        TreeNode two = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        TreeNode three = new TreeNode(3, four, five);
        TreeNode root = new TreeNode(1, two, three);

        Assertions.assertEquals(root, sut.deserialize(sut.serialize(root)));
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode();

        Assertions.assertEquals(root, sut.deserialize(sut.serialize(root)));
    }

    @Test
    public void deserialize() {
        TreeNode two = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        TreeNode three = new TreeNode(3, four, five);
        TreeNode root = new TreeNode(1, two, three);

        String input = "1,2,null,null,3,4,null,null,5,null,null";
        Assertions.assertEquals(root, sut.deserialize(input));
    }

    @Test
    public void serialize() {
        TreeNode two = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        TreeNode three = new TreeNode(3, four, five);
        TreeNode root = new TreeNode(1, two, three);

        String expected = "1,2,3,null,null,4,5";
        Assertions.assertEquals(expected, sut.serialize(root));
    }
}