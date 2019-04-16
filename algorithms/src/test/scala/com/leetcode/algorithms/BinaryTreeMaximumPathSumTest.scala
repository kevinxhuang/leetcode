package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil

class BinaryTreeMaximumPathSumTest extends AlgorithmsTest {
  "BinaryTreeMaximumPathSum" should "pass basic test case 1" in {
    val root = AlgorithmsUtil.createBinaryTree(Array(1,2,3))
    BinaryTreeMaximumPathSum.maxPathSum(root) shouldBe 6
  }

  "BinaryTreeMaximumPathSum" should "pass basic test case 2" in {
    val root = AlgorithmsUtil.createBinaryTree(Array(-10,9,20,null,null,15,7))
    BinaryTreeMaximumPathSum.maxPathSum(root) shouldBe 42
  }

  "BinaryTreeMaximumPathSum" should "pass test case 1" in {
    val root = AlgorithmsUtil.createBinaryTree(Array(1, 2))
    BinaryTreeMaximumPathSum.maxPathSum(root) shouldBe 3
  }

  "BinaryTreeMaximumPathSum" should "pass test case 2" in {
    val root = AlgorithmsUtil.createBinaryTree(Array(1, -2, 3))
    BinaryTreeMaximumPathSum.maxPathSum(root) shouldBe 4
  }

  "BinaryTreeMaximumPathSum" should "pass test case 3" in {
    val root = AlgorithmsUtil.createBinaryTree(Array(1,-2,-3,1,3,-2,null,-1))
    BinaryTreeMaximumPathSum.maxPathSum(root) shouldBe 3
  }
}
