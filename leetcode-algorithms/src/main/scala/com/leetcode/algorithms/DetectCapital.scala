package com.leetcode.algorithms

/**
  * https://leetcode.com/problems/detect-capital
  */
object DetectCapital {
  def detectCapitalUse(word: String): Boolean = {
    word.forall(c => c.isUpper) || word.forall(c => c.isLower) || (word.head.isUpper && word.tail.forall(c => c.isLower))
  }
}
