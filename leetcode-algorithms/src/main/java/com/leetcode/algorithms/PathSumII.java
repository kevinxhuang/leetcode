package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumII {


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Set<TreeNode> visited = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        int sumOfStack = 0;
        stack.push(root);
        visited.add(root);
        sumOfStack += root.val;
        while(!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left == null && node.right == null && sumOfStack == sum) {
                Iterator<TreeNode> stackIterator = stack.iterator();
                List<Integer> validPath = new ArrayList<>();
                validPath.add(stackIterator.next().val);
                while (stackIterator.hasNext()) {
                    validPath.add(stackIterator.next().val);
                }
                result.add(validPath);
            } else if (node.left != null && !visited.contains(node.left)) {
                stack.push(node.left);
                visited.add(node.left);
                sumOfStack += node.left.val;
                continue;
            } else if (node.right != null && !visited.contains(node.right)) {
                stack.push(node.right);
                visited.add(node.right);
                sumOfStack += node.right.val;
                continue;
            }

            stack.pop();
            sumOfStack -= node.val;
        }

        return result;
    }
}
