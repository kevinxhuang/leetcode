package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel.TreeNode

/**
  * 654. Maximum Binary Tree
  */
object MaximumBinaryTree {
  def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
    if(nums.isEmpty) {
      null
    } else {
      val root = new TreeNode(nums.max)
      val indexOfMaxNum = nums.indexOf(root.value)

      if(indexOfMaxNum == 0) {
        root.right = constructMaximumBinaryTree(nums.slice(1, nums.length))
      } else if (indexOfMaxNum == nums.length - 1) {
        root.left = constructMaximumBinaryTree(nums.slice(0, nums.length - 1))
      } else {
        root.left = constructMaximumBinaryTree(nums.slice(0, indexOfMaxNum))
        root.right = constructMaximumBinaryTree(nums.slice(indexOfMaxNum + 1, nums.length))
      }

      root
    }
  }
}
