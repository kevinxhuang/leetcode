package com.leetcode.algorithms

/**
  * 1228. Missing Number In Arithmetic Progression
  */
object MissingNumberInArithmeticProgression {
  def missingNumber(arr: Array[Int]): Int = {
    var maxDiffIndex = 0
    var maxDiff = if(arr(1) - arr(0) > 0) {
      Int.MinValue
    } else if(arr(1) - arr(0) < 0) {
      Int.MaxValue
    } else {
      0
    }
    if(maxDiff == 0) {
      return 0
    }
    for(i <- 0 until arr.length - 1) {
      val diff = arr(i + 1) - arr(i)
      if((diff > 0 && maxDiff < diff) || (diff < 0 && maxDiff > diff)) {
        maxDiffIndex = i
        maxDiff = diff
      }
    }

    arr(maxDiffIndex) + maxDiff / 2
  }
}
