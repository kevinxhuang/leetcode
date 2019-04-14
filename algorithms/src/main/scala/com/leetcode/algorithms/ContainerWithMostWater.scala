package com.leetcode.algorithms

/**
  * 11. Container With Most Water
  */
object ContainerWithMostWater {
  def maxArea(height: Array[Int]): Int = {
    var left = 0
    var right = height.length - 1
    var maxArea = 0

    while (left < right) {
      maxArea = Math.max(maxArea, Math.min(height(left), height(right)) * (right - left))
      if (height(left) < height(right)) {
        left += 1
      } else {
        right -= 1
      }
    }

    maxArea
  }
}
