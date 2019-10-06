package com.leetcode.algorithms

/**
  * 162. Find Peak Element
  */
object FindPeakElement {
  def findPeakElement(nums: Array[Int]): Int = {
    findPeakElement(nums, 0, nums.length - 1)
  }

  private def findPeakElement(nums: Array[Int], low: Int, high: Int): Int = {
    if(low == high) {
      low
    } else {
      val mid: Int = (low + high) / 2
      if(nums(mid) > nums(mid + 1)) {
        findPeakElement(nums, 0, mid)
      } else {
        findPeakElement(nums, mid + 1, high)
      }
    }
  }
}
