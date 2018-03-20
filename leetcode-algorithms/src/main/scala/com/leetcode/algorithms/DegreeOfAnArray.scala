package com.leetcode.algorithms

/**
  * 697. Degree of an Array
  */
object DegreeOfAnArray {
  def findShortestSubArray(nums: Array[Int]): Int = {
    val frequency = nums.map((_, 1)).groupBy(_._1).map(group => (group._1, group._2.length))
      .toSeq.sortWith({case (a, b) => a._2 > b._2})
    val degree = frequency.head._2
    val maxFrequencyElements = frequency.filter(_._2 == degree)
    var result = Integer.MAX_VALUE
    for(maxFrequencyElement <- maxFrequencyElements) {
      val start = nums.zipWithIndex.find({case (num, _) => num == maxFrequencyElement._1}).get._2
      val end = nums.zipWithIndex.reverse.find({case (num, _) => num == maxFrequencyElement._1}).get._2
      result = result.min(end - start + 1)
    }

    result
  }
}
