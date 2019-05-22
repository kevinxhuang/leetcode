package com.leetcode.algorithms

class PermutationsTest extends AlgorithmsTest {
  "Permutations" should "pass basic test cases" in {
    Permutations.permute(Array(1,2,3)) should contain theSameElementsAs List(
      List(1,2,3),
      List(1,3,2),
      List(2,1,3),
      List(2,3,1),
      List(3,1,2),
      List(3,2,1)
    )
  }
}
