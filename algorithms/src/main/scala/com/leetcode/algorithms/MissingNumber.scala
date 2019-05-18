package com.leetcode.algorithms

/**
  * 268. Missing Number
  */
object MissingNumber {
  def missingNumber(nums: Array[Int]): Int = {
    val n = nums.length + 1
    (n - 1) * n / 2 - nums.sum
  }
}
