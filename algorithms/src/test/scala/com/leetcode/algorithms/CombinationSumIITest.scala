package com.leetcode.algorithms

class CombinationSumIITest extends AlgorithmsTest {
  "CombinationSumII" should "pass basic test case 1" in {
    CombinationSumII.combinationSum2(Array(10,1,2,7,6,1,5), 8) should contain theSameElementsAs
      List(List(1, 7), List(1, 2, 5), List(2, 6), List(1, 1, 6))
  }

  "CombinationSumII" should "pass basic test case 2" in {
    CombinationSumII.combinationSum2(Array(2,5,2,1,2), 5) should contain theSameElementsAs
      List(List(1,2,2), List(5))
  }
}
