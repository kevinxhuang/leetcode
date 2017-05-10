package com.leetcode.algorithms;

import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.left = null;
        root.right = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreeInorderTraversal.TreeNode(3);
        AssertUtil.compareList(new BinaryTreeInorderTraversal().inorderTraversal(root), Arrays.asList(1, 3, 2));

        BinaryTreeInorderTraversal.TreeNode root2 = new BinaryTreeInorderTraversal.TreeNode(1);
        root2.left = new BinaryTreeInorderTraversal.TreeNode(2);
        root2.right = new BinaryTreeInorderTraversal.TreeNode(3);
        root2.left.left = new BinaryTreeInorderTraversal.TreeNode(4);
        root2.left.right = new BinaryTreeInorderTraversal.TreeNode(5);
        root2.left.right.left = new BinaryTreeInorderTraversal.TreeNode(6);
        AssertUtil.compareList(new BinaryTreeInorderTraversal().inorderTraversal(root2), Arrays.asList(4, 2, 6, 5, 1, 3));
    }
}
