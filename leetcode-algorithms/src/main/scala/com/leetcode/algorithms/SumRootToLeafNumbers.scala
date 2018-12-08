package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 129. Sum Root to Leaf Numbers
  *
  * https://leetcode.com/problems/sum-root-to-leaf-numbers/
  */
object SumRootToLeafNumbers {
  def sumNumbers(root: TreeNode): Int = {
    if(root != null) {
      sumNumbers(0, root)
    } else {
      0
    }
  }

  private def sumNumbers(initialNumber: Int, root: TreeNode): Int = {
    if (root.left == null && root.right == null) {
      initialNumber * 10 + root.value
    } else {
      val sumOfLeft = if (root.left != null) sumNumbers(initialNumber * 10 + root.value, root.left) else 0
      val sumOfRight = if (root.right != null) sumNumbers(initialNumber * 10 + root.value, root.right) else 0
      sumOfLeft + sumOfRight
    }
  }
}
