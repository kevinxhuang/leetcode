package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-right-side-view/?tab=Description
 */
public class BinaryTreeRightSideView {


    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> viewedNodes = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            viewedNodes.add(queue.peek().val);
            List<TreeNode> nodeBuffer = new LinkedList<>(queue);
            queue.clear();
            for(TreeNode node : nodeBuffer) {
                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
            }
        }

        return viewedNodes;
    }
}
