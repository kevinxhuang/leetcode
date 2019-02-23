package com.leetcode.algorithms

class RandomPickIndexTest extends AlgorithmsTest {
  "RandomPickIndex" should "pass basic test" in {
    val nums = Array(1,2,3,3,3)
    new RandomPickIndex(nums).pick(2) should be (1)
    Array(2, 3, 4) should contain (new RandomPickIndex(nums).pick(3))
  }
}
