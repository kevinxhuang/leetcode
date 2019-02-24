package com.leetcode.algorithms;


import com.leetcode.algorithms.model.TreeNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {
    @Test
    public void testIsValidBST() {
        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(3);
        assertTrue(new ValidateBinarySearchTree().isValidBST(tree1));

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        assertFalse(new ValidateBinarySearchTree().isValidBST(tree2));

        TreeNode tree3 = null;
        assertTrue(new ValidateBinarySearchTree().isValidBST(tree3));

        TreeNode tree4 = new TreeNode(1);
        tree4.left = new TreeNode(1);
        assertFalse(new ValidateBinarySearchTree().isValidBST(tree4));
    }
}
