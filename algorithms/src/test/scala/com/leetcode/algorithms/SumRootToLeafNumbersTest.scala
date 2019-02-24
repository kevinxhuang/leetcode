package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil

class SumRootToLeafNumbersTest extends AlgorithmsTest {
  "SumRootToLeafNumbers" should "pass basic test" in {
    val root1 = AlgorithmsUtil.createBinaryTree(Array(1, 2, 3))
    SumRootToLeafNumbers.sumNumbers(root1) should be (25)

    val root2 = AlgorithmsUtil.createBinaryTree(Array(4, 9, 0, 5, 1))
    SumRootToLeafNumbers.sumNumbers(root2) should be (1026)
  }
}
