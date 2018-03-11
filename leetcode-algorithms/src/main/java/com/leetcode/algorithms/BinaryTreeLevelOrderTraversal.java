package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
  */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<List<Integer>> result = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<TreeNode> nodesOfCurrentLevel = new LinkedList<>();
            List<TreeNode> nodesOfNextLevel = new LinkedList<>();

            while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
                nodesOfCurrentLevel.add(node);
                if (node.left != null) {
                    nodesOfNextLevel.add(node.left);
                }
                if (node.right != null) {
                    nodesOfNextLevel.add(node.right);
                }
            }

            if (nodesOfCurrentLevel.size() > 0) {
                result.add(nodesOfCurrentLevel.stream().map(node -> node.val).collect(Collectors.toList()));
            }

            if (nodesOfNextLevel.size() > 0) {
                queue.addAll(nodesOfNextLevel);
            }
        }

        return result;
    }
}
