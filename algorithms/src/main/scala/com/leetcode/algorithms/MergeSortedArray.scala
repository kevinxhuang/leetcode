package com.leetcode.algorithms

object MergeSortedArray {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var cursor = nums1.length - 1
    var cursor1 = m - 1
    var cursor2 = n - 1

    while (cursor1 >= 0 && cursor2 >= 0) {
      if (nums1(cursor1) >= nums2(cursor2)) {
        nums1(cursor) = nums1(cursor1)
        cursor1 -= 1
      } else {
        nums1(cursor) = nums2(cursor2)
        cursor2 -= 1
      }
      cursor -= 1
    }

    while (cursor2 >= 0) {
      nums1(cursor) = nums2(cursor2)
      cursor -= 1
      cursor2 -= 1
    }
  }
}
