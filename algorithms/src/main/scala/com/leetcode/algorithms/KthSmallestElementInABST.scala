package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

object KthSmallestElementInABST {

  def kthSmallest(root: TreeNode, k: Int): Int = {
    var count = 0
    var result = 0

    def inorder(root: TreeNode): Unit = {
      if(root != null) {
        if (root.left != null) {
          inorder(root.left)
        }
        count += 1
        if(count == k) {
          result = root.value
          return
        }

        if (root.right != null) {
          inorder(root.right)
        }
      }
    }

    inorder(root)

    result
  }
}
