package com.leetcode.algorithms

class ReverseIntegerTest extends AlgorithmsTest {
  "ReverseInteger" should "pass basic test" in {
    ReverseInteger.reverse(123) should be (321)
    ReverseInteger.reverse(-123) should be (-321)
    ReverseInteger.reverse(1534236469) should be (0)
  }
}
