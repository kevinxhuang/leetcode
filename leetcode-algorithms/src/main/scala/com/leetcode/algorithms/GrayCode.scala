package com.leetcode.algorithms

/**
  * 89. Gray Code
  *
  */
object GrayCode {
  def grayCode(n: Int): List[Int] = {
    (0 until math.pow(2, n).toInt).map(i => i ^ i >> 1).toList
  }
}