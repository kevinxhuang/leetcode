package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 104. Maximum Depth of Binary Tree
  */
object MaximumDepthOfBinaryTree {
  def maxDepth(root: TreeNode): Int = {
    root match {
      case null => 0
      case node if isLeaf(node) => 1
      case node => {
        val depthOfLeftTree = if (node.left != null) maxDepth(node.left) else 0
        val depthOfRightTree = if (node.right != null) maxDepth(node.right) else  0

        depthOfLeftTree.max(depthOfRightTree) + 1
      }
    }
  }

  private def isLeaf(node: TreeNode): Boolean = {
    node.left == null && node.right == null
  }
}
