package com.leetcode.algorithms

class LargestValuesFromLabelsTest extends AlgorithmsTest {
  "LargestValuesFromLabels" should "pass basic test 1" in {
    LargestValuesFromLabels.largestValsFromLabels(Array(5,4,3,2,1), Array(1,1,2,2,3), 3, 1) shouldBe 9
  }

  "LargestValuesFromLabels" should "pass basic test 2" in {
    LargestValuesFromLabels.largestValsFromLabels(Array(5,4,3,2,1), Array(1,3,3,3,2), 3, 2) shouldBe 12
  }

  "LargestValuesFromLabels" should "pass basic test 3" in {
    LargestValuesFromLabels.largestValsFromLabels(Array(9,8,8,7,6), Array(0,0,0,1,1), 3, 1) shouldBe 16
  }

  "LargestValuesFromLabels" should "pass basic test 4" in {
    LargestValuesFromLabels.largestValsFromLabels(Array(9,8,8,7,6), Array(0,0,0,1,1), 3, 2) shouldBe 24
  }
}
