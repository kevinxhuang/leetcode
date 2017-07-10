package com.leetcode.algorithms


/**
  * https://leetcode.com/problems/word-pattern
  */
object WordPattern {
  def wordPattern(pattern: String, str: String): Boolean = {
    if(pattern.length != str.split("\\s+").length) {
      return false
    }
    val zippedWords = pattern.zip(str.split("\\s+"))

    val pattern2Word = new scala.collection.mutable.HashMap[Char, String]()
    val word2Pattern = new scala.collection.mutable.HashMap[String, Char]()
    for((k,v) <- zippedWords) {
      if (pattern2Word.keySet.contains(k) && pattern2Word.get(k).get != v
        || word2Pattern.keySet.contains(v) && word2Pattern.get(v).get != k) {
        return false
      }

      pattern2Word.put(k, v)
      word2Pattern.put(v, k)
    }

    return true
  }
}
