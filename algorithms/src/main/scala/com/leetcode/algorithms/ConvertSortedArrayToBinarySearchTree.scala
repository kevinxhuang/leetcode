package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 108. Convert Sorted Array to Binary Search Tree
  */
object ConvertSortedArrayToBinarySearchTree {
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    def buildTree(low: Int, high: Int): TreeNode = {
      if(low > high) {
        null
      } else {
        val mid = (low + high) / 2
        val root = new TreeNode(nums(mid))
        root.left = buildTree(low, mid - 1)
        root.right = buildTree(mid + 1, high)
        root
      }
    }

    buildTree(0, nums.length - 1)
  }
}
