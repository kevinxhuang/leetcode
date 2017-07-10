package com.leetcode.algorithms

/**
  * https://leetcode.com/problems/top-k-frequent-elements
  */
class TopKFrequentElements {
  def topKFrequent(nums: Array[Int], k: Int): List[Int] = {
    val frequent = nums.map((_, 1)).groupBy(_._1).mapValues(_.length).toSeq.sortBy(_._2).reverse
    frequent.take(k).map(_._1).toList
  }
}
