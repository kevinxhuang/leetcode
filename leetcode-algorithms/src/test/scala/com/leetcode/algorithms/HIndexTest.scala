package com.leetcode.algorithms

class HIndexTest extends AlgorithmsTest {
  "HIndex" should "pass basic test" in {
    HIndex.hIndex(Array(3, 0, 6, 1, 5)) should be (3)
  }
}
