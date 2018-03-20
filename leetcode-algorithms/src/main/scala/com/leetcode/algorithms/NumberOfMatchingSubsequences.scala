package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 792. Number of Matching Subsequences
  */
object NumberOfMatchingSubsequences {
  def numMatchingSubseq(S: String, words: Array[String]): Int = {
    val matchedWords = new mutable.HashSet[String]()
    val mismatchedWords = new mutable.HashSet[String]()
    words.foreach(
      word =>
        if(matchedWords.contains(word) || matchedWords.exists(_.contains(word))) {
          matchedWords.add(word)
        } else if(mismatchedWords.contains(word) || mismatchedWords.exists(word.contains(_))){
          mismatchedWords.add(word)
        } else {
          if (matching(S, word)) {
            matchedWords.add(word)
          } else {
            mismatchedWords.add(word)
          }
        }
    )

    words.count(matchedWords.contains)
  }

  private def matching(str: String, word: String): Boolean = {
    var i = 0
    var j = 0

    if (word.length() == 0) {
      return true
    }

    while (j < str.length()) {
      if (word.charAt(i) == str.charAt(j)) {
        i += 1
      }
      j += 1

      if (i == word.length()) {
        return true
      }
    }

    false
  }
}
