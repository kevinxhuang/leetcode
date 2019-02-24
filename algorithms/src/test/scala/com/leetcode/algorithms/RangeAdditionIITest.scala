package com.leetcode.algorithms

class RangeAdditionIITest extends AlgorithmsTest {
  "RangeAdditionII" should "pass basic test" in {
    RangeAdditionII.maxCount(3, 3, Array(Array(2, 2), Array(3,3))) should be (4)
  }
}
