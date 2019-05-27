package com.leetcode.algorithms

import scala.collection.mutable

object IntersectionOfTwoArraysII {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val statsMap1 = getStats(nums1)
    val statsMap2 = getStats(nums2)

    (statsMap1.keySet & statsMap2.keySet)
      .toArray
      .map(num => (num, statsMap1(num).min(statsMap2(num))))
      .flatMap({case (num, count) => Array.fill[Int](count)(num)})
  }

  private def getStats(nums: Array[Int]): Map[Int, Int] = {
    val statsMap = new mutable.HashMap[Int, Int]()
    nums.foreach(num =>
      statsMap.put(num, statsMap.getOrElse(num, 0) + 1)
    )
    statsMap.toMap
  }
}
