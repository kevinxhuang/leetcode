package com.leetcode.algorithms

class PowTest extends AlgorithmsTest {
  "Pow" should "pass basic test" in {
    Pow.myPow(5, 0) should be (1.0)
    Pow.myPow(5, 1) should be (5.0)
    Pow.myPow(5, 2) should be (25.0)
    Pow.myPow(2, 10) should be (1024.0)
  }
}
