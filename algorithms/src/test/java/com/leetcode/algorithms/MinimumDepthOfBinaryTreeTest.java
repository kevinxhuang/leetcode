package com.leetcode.algorithms;


import com.leetcode.algorithms.model.TreeNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinimumDepthOfBinaryTreeTest {
    @Test
    public void testMinDepth() {
        TreeNode root1= new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        assertEquals(new MinimumDepthOfBinaryTree().minDepth(root1), 2);

        TreeNode root2= new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        assertEquals(new MinimumDepthOfBinaryTree().minDepth(root2), 3);

        TreeNode root3= new TreeNode(1);
        assertEquals(new MinimumDepthOfBinaryTree().minDepth(root3), 1);

        TreeNode root4= new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.right = new TreeNode(4);
        assertEquals(new MinimumDepthOfBinaryTree().minDepth(root4), 2);
    }

}
