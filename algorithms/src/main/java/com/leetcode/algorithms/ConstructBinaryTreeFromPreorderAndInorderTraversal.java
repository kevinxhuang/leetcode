package com.leetcode.algorithms;

import com.leetcode.algorithms.model.TreeNode;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 *
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) {
            return null;
        } else {
            return buildTree(preorder, 0, inorder, 0, inorder.length - 1);
        }
    }

    private TreeNode buildTree(int[] preorder, int startOfPreorder, int[] inorder, int startOfInorder, int endOfInorder) {
        if(startOfPreorder > preorder.length - 1 || startOfInorder > endOfInorder) {
            return null;
        } else {
            TreeNode root = new TreeNode(preorder[startOfPreorder]);

            int rootIndexOfInorder = 0;
            for(int i = 0; i < inorder.length; i++) {
                if(inorder[i] == root.val) {
                    rootIndexOfInorder = i;
                    break;
                }
            }

            int sizeOfLeftTree = rootIndexOfInorder - startOfInorder;

            root.left = buildTree(preorder, startOfPreorder + 1, inorder, startOfInorder, rootIndexOfInorder - 1);
            root.right = buildTree(preorder, startOfPreorder + sizeOfLeftTree + 1, inorder, rootIndexOfInorder + 1, endOfInorder);

            return root;
        }
    }
}
