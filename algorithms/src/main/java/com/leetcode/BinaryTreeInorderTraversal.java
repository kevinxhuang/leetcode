package com.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public List<Integer> inorderTraversal(TreeNode root) {

		if (root == null) {
			return Collections.EMPTY_LIST;
		} else {
			List<Integer> path = new ArrayList<>();
			InorderTraversalIterator iterator = new InorderTraversalIterator(root);
			path.add(iterator.next().val);
			while (iterator.hasNext()) {
				path.add(iterator.next().val);
			}

			return path;
		}
	}

	class InorderTraversalIterator implements Iterator<TreeNode> {

		private final Stack<TreeNode> stack;

		public InorderTraversalIterator(TreeNode root) {
			stack = new Stack<>();
			stack.push(root);
			TreeNode cursor = root;
			while(cursor.left != null) {
				stack.push(cursor.left);
				cursor = cursor.left;
			}
		}

		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public TreeNode next() {
			if (!hasNext()) {
				return null;
			}

			TreeNode node = stack.pop();
			if (node.right != null) {
				TreeNode cursor = node.right;
				stack.push(cursor);
				while (cursor.left != null) {
					stack.push(cursor.left);
					cursor = cursor.left;
				}
			}

			return node;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root));

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(5);
		root2.left.right.left = new TreeNode(6);
		System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root2));
	}

}
