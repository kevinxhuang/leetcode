package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil

class SymmetricTreeTest extends AlgorithmsTest {
  "SymmetricTree" should "pass basic test" in {
    val root = AlgorithmsUtil.createBinaryTree(Array(1, 2, 2, 3, 4, 4, 3))
    SymmetricTree.isSymmetric(root) should be (true)
  }
}
