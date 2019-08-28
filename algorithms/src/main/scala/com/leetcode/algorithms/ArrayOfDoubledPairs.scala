package com.leetcode.algorithms

/**
  * 954. Array of Doubled Pairs
  */
object ArrayOfDoubledPairs {
  def canReorderDoubled(A: Array[Int]): Boolean = {
    val negativeNums = A.filter(_ < 0).sorted(Ordering[Int].reverse)
    val positiveNums = A.filter(_ >= 0).sorted

    _canReorderDoubled(negativeNums) && _canReorderDoubled(positiveNums)
  }

  private def _canReorderDoubled(nums: Array[Int]): Boolean = {
    var stats = nums.map((_, 1))
      .groupBy(_._1)
      .map({ case (key, values) => (key, values.length)})

    nums.foreach(num => {
      if(stats(num) > 0) {
        if(stats.contains(num * 2) && stats(num * 2) > 0) {
          stats = stats.updated(num, stats(num) - 1)
          stats = stats.updated(num * 2, stats(num * 2) - 1)
        } else {
          return false
        }
      }
    })
    true
  }
}
