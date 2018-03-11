package com.leetcode.algorithms

/**
  * 506. Relative Ranks
  *
  * https://leetcode.com/problems/relative-ranks
  */
object RelativeRanks {
  def findRelativeRanks(nums: Array[Int]): Array[String] = {
    nums.indices.sortBy(nums(_))(Ordering[Int].reverse).zipWithIndex.map({case (i, r) =>
        val rank = r match {
          case 0 => "Gold Medal"
          case 1 => "Silver Medal"
          case 2 => "Bronze Medal"
          case _ => (r + 1).toString
        }
      (i, rank)
    }).sortBy(_._1).map(_._2).toArray
  }
}
