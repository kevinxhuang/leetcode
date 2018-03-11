package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 669. Trim a Binary Search Tree
  *
  */
object TrimABinarySearchTree {
  def trimBST(root: TreeNode, L: Int, R: Int): TreeNode = {
    if (root == null) {
      null
    } else {
      if(root.value < L) {
        trimBST(root.right, L, R)
      } else if(root.value > R) {
        trimBST(root.left, L, R)
      } else {
        root.left = trimBST(root.left, L, R)
        root.right = trimBST(root.right, L, R)
        root
      }
    }
  }
}
