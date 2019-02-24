package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BalancedBinaryTreeTest {

    @Test
    public void testIsBalanced() {
        TreeNode root = new TreeNode(1);
        assertEquals(new BalancedBinaryTree().isBalanced(root), true);
        root.left = new TreeNode(2);
        assertEquals(new BalancedBinaryTree().isBalanced(root), true);
        root.left.left = new TreeNode(3);
        assertEquals(new BalancedBinaryTree().isBalanced(root), false);
        root.right = new TreeNode(4);
        assertEquals(new BalancedBinaryTree().isBalanced(root), true);
    }
}
