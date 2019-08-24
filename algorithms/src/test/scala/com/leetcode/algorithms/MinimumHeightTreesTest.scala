package com.leetcode.algorithms

class MinimumHeightTreesTest extends AlgorithmsTest {
  "MinimumHeightTrees" should "pass basic test 1" in {
    MinimumHeightTrees.findMinHeightTrees(4, Array(Array(1, 0), Array(1, 2), Array(1, 3))) shouldBe List(1)
  }

  "MinimumHeightTrees" should "pass basic test 2" in {
    MinimumHeightTrees.findMinHeightTrees(6, Array(Array(0, 3), Array(1, 3), Array(2, 3), Array(4, 3), Array(5, 4))) should
      contain theSameElementsAs  List(3, 4)
  }
}
