package com.leetcode.algorithms

object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    nums.reduce(_ ^ _)
  }
}
