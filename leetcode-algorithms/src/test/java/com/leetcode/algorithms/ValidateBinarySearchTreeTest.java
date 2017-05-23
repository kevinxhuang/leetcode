package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {
    @Test
    public void testIsValidBST() {
        ValidateBinarySearchTree.TreeNode tree1 = new ValidateBinarySearchTree.TreeNode(2);
        tree1.left = new ValidateBinarySearchTree.TreeNode(1);
        tree1.right = new ValidateBinarySearchTree.TreeNode(3);
        assertTrue(new ValidateBinarySearchTree().isValidBST(tree1));

        ValidateBinarySearchTree.TreeNode tree2 = new ValidateBinarySearchTree.TreeNode(1);
        tree2.left = new ValidateBinarySearchTree.TreeNode(2);
        tree2.right = new ValidateBinarySearchTree.TreeNode(3);
        assertFalse(new ValidateBinarySearchTree().isValidBST(tree2));

        ValidateBinarySearchTree.TreeNode tree3 = null;
        assertTrue(new ValidateBinarySearchTree().isValidBST(tree3));

        ValidateBinarySearchTree.TreeNode tree4 = new ValidateBinarySearchTree.TreeNode(1);
        tree4.left = new ValidateBinarySearchTree.TreeNode(1);
        assertFalse(new ValidateBinarySearchTree().isValidBST(tree4));
    }
}
