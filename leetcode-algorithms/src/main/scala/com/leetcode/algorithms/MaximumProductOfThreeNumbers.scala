package com.leetcode.algorithms

/**
  * 628. Maximum Product of Three Numbers
  */
object MaximumProductOfThreeNumbers {
  def maximumProduct(nums: Array[Int]): Int = {
    val sortedNums = nums.sorted
    Math.max(sortedNums.takeRight(3).product, sortedNums.take(2).product * sortedNums.last)
  }
}
