package com.leetcode.algorithms

object ReverseWordsInAStringIII {
  def reverseWords(s: String): String = {
    s.split("\\s+").map(_.reverse).mkString(" ")
  }
}
