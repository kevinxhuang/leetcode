package com.leetcode.algorithms

class LongestIncreasingSubsequenceTest extends AlgorithmsTest {
  "LongestIncreasingSubsequence" should "pass basic test" in {
    LongestIncreasingSubsequence.lengthOfLIS(Array(10,9,2,5,3,7,101,18)) shouldBe 4
  }
}
