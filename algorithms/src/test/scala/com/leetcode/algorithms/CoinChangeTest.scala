package com.leetcode.algorithms

class CoinChangeTest extends AlgorithmsTest {
  "CoinChange" should "pass test suite 1" in {
    CoinChange.coinChange(Array(1, 2, 5), 11) shouldBe 3
  }

  "CoinChange" should "pass test suite 2" in {
    CoinChange.coinChange(Array(2), 3) shouldBe -1
  }
}
