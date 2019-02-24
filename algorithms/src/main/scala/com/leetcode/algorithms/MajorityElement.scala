package com.leetcode.algorithms

/**
  * 169. Majority Element
  */
object MajorityElement {
  import scala.collection.mutable

  def majorityElement(nums: Array[Int]): Int = {
    val stats = new mutable.HashMap[Int, Int]()
    nums.foreach(num => {
      val count = stats.getOrElse(num, 0)
      if(count >= nums.length / 2) {
        return num
      }
      stats.update(num, count + 1)
    })

    stats.maxBy(_._2)._1
  }
}
