package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;

/**
  */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return _minDepth(root, 1);
    }

    private int _minDepth(TreeNode root, int currentDepth) {
        if (root.left == null && root.right == null) {
            return currentDepth;
        } else {
            int minDepthOfLeft = Integer.MAX_VALUE;
            int minDepthOfRight = Integer.MAX_VALUE;
            if (root.left != null) {
                minDepthOfLeft = _minDepth(root.left, currentDepth + 1);
            }
            if (root.right != null) {
                minDepthOfRight = _minDepth(root.right, currentDepth + 1);
            }

            return Math.min(minDepthOfLeft, minDepthOfRight);
        }
    }
}
