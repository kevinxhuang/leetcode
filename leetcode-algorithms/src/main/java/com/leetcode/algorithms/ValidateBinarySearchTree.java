package com.leetcode.algorithms;


import com.leetcode.algorithms.model.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/validate-binary-search-tree
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        List<Integer> values = inorderTraversal(root);
        for(int i = 1; i < values.size(); i++) {
            if (values.get(i-1) >= values.get(i)) {
                return false;
            }
        }

        return true;
    }

    private List<Integer> inorderTraversal(TreeNode root) {

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

    private class InorderTraversalIterator implements Iterator<TreeNode> {

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
}
