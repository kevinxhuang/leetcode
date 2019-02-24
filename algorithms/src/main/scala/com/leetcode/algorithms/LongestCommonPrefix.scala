package com.leetcode.algorithms

/**
  * 14. Longest Common Prefix
  *
  * https://leetcode.com/problems/longest-common-prefix/
  */
object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    if(strs.isEmpty || strs.exists(_.isEmpty)) {
      ""
    } else if(strs.length == 1) {
      strs.head
    } else {
      val shortestStr = strs.minBy(_.length)

      (0 until shortestStr.length).find(index =>
        !strs.forall(_.startsWith(shortestStr.substring(0, index + 1)))) match {
        case Some(pos) => shortestStr.substring(0, pos)
        case None => shortestStr
      }
    }
  }
}
