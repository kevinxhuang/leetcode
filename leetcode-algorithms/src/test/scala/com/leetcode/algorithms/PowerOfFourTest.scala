package com.leetcode.algorithms

class PowerOfFourTest extends AlgorithmsTest {
  "PowerOfFour" should "pass basic test" in {
    PowerOfFour.isPowerOfFour(0) should be (false)
    PowerOfFour.isPowerOfFour(1) should be (true)
    PowerOfFour.isPowerOfFour(4) should be (true)
    PowerOfFour.isPowerOfFour(5) should be (false)
    PowerOfFour.isPowerOfFour(16) should be (true)
  }
}
