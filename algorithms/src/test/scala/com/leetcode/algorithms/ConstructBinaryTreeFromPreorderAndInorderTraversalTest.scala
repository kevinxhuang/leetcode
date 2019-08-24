package com.leetcode.algorithms


class ConstructBinaryTreeFromPreorderAndInorderTraversalTest extends AlgorithmsTest {
  "ConstructBinaryTreeFromPreorderAndInorderTraversal" should "pass basic test" in {
    new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(Array(3,9,20,15,7), Array(9,3,15,20,7))
  }
}
