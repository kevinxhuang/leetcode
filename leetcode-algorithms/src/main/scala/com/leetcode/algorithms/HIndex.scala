package com.leetcode.algorithms

/**
  * 274. H-Index
  *
  * https://leetcode.com/problems/h-index
  */
object HIndex {
  def hIndex(citations: Array[Int]): Int = {
    val sortedCitations = citations.sorted
    var hIndex = 0
    for(i <- 0 until sortedCitations.length) {
      hIndex = hIndex.max(sortedCitations(i).min(sortedCitations.length - i))
    }

    hIndex
  }
}
