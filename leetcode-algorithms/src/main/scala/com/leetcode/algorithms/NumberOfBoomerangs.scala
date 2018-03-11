package com.leetcode.algorithms


/**
  */
object NumberOfBoomerangs {
  def numberOfBoomerangs(points: Array[Array[Int]]): Int = {
    def distance = (p1: Array[Int], p2: Array[Int]) => (p1(0) - p2(0)) * (p1(0) - p2(0)) + (p1(1) - p2(1)) * (p1(1) - p2(1))

    var result = 0
    for(i <- 0 until points.length) {
      val distMap = new scala.collection.mutable.HashMap[Int, Int]()
      for(j <- 0 until points.length) {
        if (i != j) {
          val dist = distance(points(i), points(j))
          distMap.put(dist, distMap.get(dist).getOrElse(0) + 1)
        }
      }

      result += distMap.values.foldLeft(0) ((sum, i) => sum + i  * (i - 1))
    }

    return result
  }
}
