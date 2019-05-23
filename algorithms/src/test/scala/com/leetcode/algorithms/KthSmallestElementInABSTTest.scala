package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil

class KthSmallestElementInABSTTest extends AlgorithmsTest {
  "KthSmallestElementInABST" should "pass basic test 1" in {
    KthSmallestElementInABST.kthSmallest(AlgorithmsUtil.createBinaryTree(Array(3,1,4,null,2)), 1) shouldBe 1
  }

  "KthSmallestElementInABST" should "pass basic test 2" in {
    KthSmallestElementInABST.kthSmallest(AlgorithmsUtil.createBinaryTree(Array(5,3,6,2,4,null,null,1)), 3) shouldBe 3
  }
}
