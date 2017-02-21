package com.leetcode;

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

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);

		System.out.println(new BinaryTreeRightSideView().rightSideView(root));

		System.out.println(new BinaryTreeRightSideView().rightSideView(new TreeNode(1)));
		System.out.println(new BinaryTreeRightSideView().rightSideView(null));
	}
}
