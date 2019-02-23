package com.leetcode.algorithms

class RotateFunctionTest extends AlgorithmsTest {
  "RotateFunction" should "pass basic test" in {
    RotateFunction.maxRotateFunction(Array(4, 3, 2, 6)) should be (26)
    RotateFunction.maxRotateFunction(Array(1)) should be (0)
    RotateFunction.maxRotateFunction(Array(1,2)) should be (2)
    RotateFunction.maxRotateFunction(Array()) should be (0)
  }
}
