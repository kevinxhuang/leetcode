package com.leetcode.algorithms

class DegreeOfAnArrayTest extends AlgorithmsTest {
  "DegreeOfAnArray" should "pass basic test" in {
    DegreeOfAnArray.findShortestSubArray(Array(1,2,2,3,1)) should be (2)
  }
}
