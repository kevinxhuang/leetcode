package com.leetcode.algorithms

/**
  * 34. Find First and Last Position of Element in Sorted Array
  */
object FindFirstAndLastPositionOfElementInSortedArray {
  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    Array(nums.indexOf(target), nums.lastIndexOf(target))
  }
}
