package com.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
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

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		System.out.println(new BalancedBinaryTree().isBalanced(root)); // true;
		root.left = new TreeNode(2);
		System.out.println(new BalancedBinaryTree().isBalanced(root)); // true;
		root.left.left = new TreeNode(3);
		System.out.println(new BalancedBinaryTree().isBalanced(root)); // false;
		root.right = new TreeNode(4);
		System.out.println(new BalancedBinaryTree().isBalanced(root)); // true;
	}
}
