package com.leetcode.algorithms

object GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    strs.groupBy(_.sorted).mapValues(_.toList).values.toList
  }
}
