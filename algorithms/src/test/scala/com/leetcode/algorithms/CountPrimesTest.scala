package com.leetcode.algorithms

class CountPrimesTest extends AlgorithmsTest {
  "CountPrimes" should "pass basic test" in {
    CountPrimes.countPrimes(10) shouldBe 4
  }

  "CountPrimes" should "pass if n less than 2" in {
    CountPrimes.countPrimes(0) shouldBe 0
    CountPrimes.countPrimes(1) shouldBe 0
    CountPrimes.countPrimes(2) shouldBe 0
  }
}
