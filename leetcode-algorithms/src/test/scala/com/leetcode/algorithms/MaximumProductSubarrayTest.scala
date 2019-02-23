package com.leetcode.algorithms

class MaximumProductSubarrayTest extends AlgorithmsTest {
  "MaximumProductSubarray" should "pass basic test" in {
    MaximumProductSubarray.maxProduct(Array(2,3,-2,4)) should be (6)
  }
}
