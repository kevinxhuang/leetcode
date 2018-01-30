package com.leetcode.algorithms

/**
  * 89. Gray Code
  *
  * https://leetcode.com/problems/gray-code
  */
object GrayCode {
  def grayCode(n: Int): List[Int] = {
    (0 until math.pow(2, n).toInt).map(i => i ^ i >> 1).toList
  }
}