package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;
import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        AssertUtil.compareList(new BinaryTreeInorderTraversal().inorderTraversal(root), Arrays.asList(1, 3, 2));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.left.right.left = new TreeNode(6);
        AssertUtil.compareList(new BinaryTreeInorderTraversal().inorderTraversal(root2), Arrays.asList(4, 2, 6, 5, 1, 3));
    }
}
