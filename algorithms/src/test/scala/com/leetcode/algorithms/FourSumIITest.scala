package com.leetcode.algorithms

class FourSumIITest extends AlgorithmsTest {
  "FourSumII" should "pass basic test" in {
    FourSumII.fourSumCount(Array(1, 2), Array(-2, -1), Array(-1, 2), Array(0, 2)) shouldBe 2
  }
}
