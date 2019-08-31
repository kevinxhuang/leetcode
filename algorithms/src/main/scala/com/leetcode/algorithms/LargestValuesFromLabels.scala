package com.leetcode.algorithms

/**
  * 1090. Largest Values From Labels
  */
object LargestValuesFromLabels {
  def largestValsFromLabels(values: Array[Int], labels: Array[Int], num_wanted: Int, use_limit: Int): Int = {
    labels.zip(values)
      .groupBy(_._1)
      .map({case (label, tuples) => (label, tuples.map(_._2)
        .sorted(Ordering[Int].reverse)
        .take(use_limit))})
      .flatMap(_._2)
      .toList
      .sorted(Ordering[Int].reverse)
      .take(num_wanted)
      .sum
  }
}
