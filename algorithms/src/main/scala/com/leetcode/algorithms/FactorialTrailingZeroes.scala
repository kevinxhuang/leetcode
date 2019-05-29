package com.leetcode.algorithms

/**
  * 172. Factorial Trailing Zeroes
  */
object FactorialTrailingZeroes {
  def trailingZeroes(n: Int): Int = {
    if(n == 0) 0 else n / 5 + trailingZeroes(n / 5)
  }
}
