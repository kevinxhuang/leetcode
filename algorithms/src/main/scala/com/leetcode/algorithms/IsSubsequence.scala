package com.leetcode.algorithms

/**
  * 392. Is Subsequence
  */
object IsSubsequence {
  def isSubsequence(s: String, t: String): Boolean = {
    if(s.isEmpty) {
      true
    } else {
      var i = 0
      var j = 0
      while(j < t.length) {
        if(s(i) == t(j)) {
          i += 1
          if(i == s.length) {
            return true
          }
        }
        j += 1
      }

      false
    }
  }
}
