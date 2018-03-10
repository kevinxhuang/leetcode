package com.leetcode.algorithms

/**
  * 398. Random Pick Index
  *
  * https://leetcode.com/problems/random-pick-index
  */
class RandomPickIndex(_nums: Array[Int]) {
  import scala.collection.mutable
  import scala.util.Random

  private var stats = new mutable.HashMap[Int, mutable.MutableList[Int]]()

  _nums.indices.foreach(i => {
    if(stats.contains(_nums(i))) {
      stats(_nums(i)) += i
    } else {
      stats.put(_nums(i), new mutable.MutableList[Int]() += i)
    }
  })

  def pick(target: Int): Int = {
    val indices = stats(target)
    indices(new Random().nextInt(indices.length))
  }
}
