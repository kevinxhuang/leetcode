package com.leetcode.algorithms

class UglyNumberTest extends AlgorithmsTest {
  "UglyNumber" should "pass basic test" in {
    UglyNumber.isUgly(6) should be (true)
    UglyNumber.isUgly(14) should be (false)
  }
}
