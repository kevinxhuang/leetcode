package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 124. Binary Tree Maximum Path Sum
  */
object BinaryTreeMaximumPathSum {
  private var maxSum = Int.MinValue
  def maxPathSum(root: TreeNode): Int = {
    maxSum = Int.MinValue
    dfs(root)
    maxSum
  }

  def dfs(root: TreeNode): Int = {
    if(root == null) {
      Int.MinValue
    } else {
      val maxSumOfLeft = dfs(root.left)
      val maxSumOfRight = dfs(root.right)

      maxSum = maxSum
        .max(maxSumOfLeft)
        .max(maxSumOfRight)
        .max(root.value + maxSumOfLeft.max(0) + maxSumOfRight.max(0))
      root.value + 0.max(maxSumOfLeft).max(maxSumOfRight)
    }
  }
}
