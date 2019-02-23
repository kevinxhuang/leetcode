package com.leetcode.algorithms

class GrayCodeTest extends AlgorithmsTest {
  "GrayCode" should "pass basic test" in {
    GrayCode.grayCode(0) should be (List(0))
    GrayCode.grayCode(2) should be (List(0,1,3,2))
    GrayCode.grayCode(3) should be (List(0, 1, 3, 2, 6, 7, 5, 4))
  }
}
