package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

object DiameterOfBinaryTree {
  private var diameter = 0

  def diameterOfBinaryTree(root: TreeNode): Int = {
    diameter = 0
    computeMaxDepthOfBinaryTree(root)
    diameter
  }

  private def computeMaxDepthOfBinaryTree(root: TreeNode): Int = {
    if(root == null) {
      0
    } else {
      val maxDepthOfLeft = computeMaxDepthOfBinaryTree(root.left)
      val maxDepthOfRight = computeMaxDepthOfBinaryTree(root.right)

      diameter = diameter.max(maxDepthOfLeft + maxDepthOfRight)

      maxDepthOfLeft.max(maxDepthOfRight) + 1
    }
  }
}
