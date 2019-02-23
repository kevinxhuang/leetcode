package com.leetcode.algorithms

class SubarraySumEqualsKTest extends AlgorithmsTest {
  "SubarraySumEqualsK" should "pass basic test" in {
    SubarraySumEqualsK.subarraySum(Array(1,1,1), 2) should be (2)
    SubarraySumEqualsK.subarraySum(Array(1,1,1), 3) should be (1)
    SubarraySumEqualsK.subarraySum(Array(1), 1) should be (1)
    SubarraySumEqualsK.subarraySum(Array(), 1) should be (0)
    SubarraySumEqualsK.subarraySum(Array(-1,-1,1), 0) should be (1)
  }
}
