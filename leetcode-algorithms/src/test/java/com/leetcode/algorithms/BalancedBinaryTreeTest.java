package com.leetcode.algorithms;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BalancedBinaryTreeTest {

    @Test
    public void testIsBalanced() {
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1);
        assertEquals(new BalancedBinaryTree().isBalanced(root), true);
        root.left = new BalancedBinaryTree.TreeNode(2);
        assertEquals(new BalancedBinaryTree().isBalanced(root), true);
        root.left.left = new BalancedBinaryTree.TreeNode(3);
        assertEquals(new BalancedBinaryTree().isBalanced(root), false);
        root.right = new BalancedBinaryTree.TreeNode(4);
        assertEquals(new BalancedBinaryTree().isBalanced(root), true);
    }
}
