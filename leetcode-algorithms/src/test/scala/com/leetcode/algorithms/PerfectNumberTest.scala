package com.leetcode.algorithms

class PerfectNumberTest extends AlgorithmsTest {
  "PerfectNumber" should "pass basic test" in {
    PerfectNumber.checkPerfectNumber(28) should be (true)
    PerfectNumber.checkPerfectNumber(1) should be (false)
  }
}
