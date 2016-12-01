package com.leetcode;

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


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        //[5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right =  new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        System.out.println(new PathSumII().pathSum(root, 22));
    }
}
