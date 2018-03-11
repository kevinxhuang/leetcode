package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;

import java.util.*;

/**
  */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            stack.push(node);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        Map<TreeNode, Integer> depthMap = new HashMap<>();
        while(!stack.isEmpty()) {
            int depthOfLeftSubtree = 0;
            int depthOfRightSubtree = 0;
            TreeNode node = stack.pop();
            if (node.left != null) {
                depthOfLeftSubtree = depthMap.get(node.left);
            }
            if (node.right != null) {
                depthOfRightSubtree = depthMap.get(node.right);
            }

            if (depthOfLeftSubtree - depthOfRightSubtree > 1 || depthOfLeftSubtree - depthOfRightSubtree < -1) {
                return false;
            }

            depthMap.put(node, Math.max(depthOfLeftSubtree, depthOfRightSubtree) + 1);
        }
        return true;
    }
}
