package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 219. Contains Duplicate II
  */
object ContainsDuplicateII {
  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
    val indexMap = new mutable.HashMap[Int, Int]()

    nums.indices.foreach(i => {
      if (indexMap.contains(nums(i)) && (i - indexMap(nums(i))) <= k) {
        return true
      }
      indexMap.put(nums(i), i)
    })

    false
  }
}
