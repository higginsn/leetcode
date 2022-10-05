package com.higginsn.top100.trees;

import com.higginsn.models.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
public class SerializeAndDeserializeBinaryTree {

    private static final int INVALID_INT = -10000;
    private List<List<Integer>> result = new ArrayList<>();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        return helper(root, 0, "");
    }

    private String helper(TreeNode root, int level, String serialization) {
        if (root == null) {
            return serialization + "null,";
        }

        serialization += root.val + ",";

        if (result.size() <= level) {
            List<Integer> newLevel = new ArrayList<>();
            newLevel.add(root.val);
            result.add(newLevel);
        } else {
            result.get(level).add(root.val);
        }

        serialization = helper(root.left, level + 1, serialization);
        return helper(root.right, level + 1, serialization);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return new TreeNode();
        }

        Queue<Integer> inputQueue = Arrays.stream(data.split(","))
                .map(datum -> {
                    if (Objects.equals(datum, "null")) {
                        return INVALID_INT;
                    }
                    return Integer.valueOf(datum);
                }).collect(Collectors.toCollection(LinkedList::new));

        Queue<TreeNode> queue = new LinkedList<>();
        Integer rootValue = inputQueue.poll();
        TreeNode root = (rootValue == INVALID_INT) ? null : new TreeNode(rootValue);
        queue.add(root);
        while (!inputQueue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                continue;
            }
            Integer leafValue = inputQueue.poll();
            node.left = (leafValue == INVALID_INT) ? null : new TreeNode(leafValue);
            queue.add(node.left);
            leafValue = inputQueue.poll();
            node.right = (leafValue == INVALID_INT) ? null : new TreeNode(leafValue);
            queue.add(node.right);
        }
        return root;
    }

}
