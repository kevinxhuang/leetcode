package com.leetcode.algorithms

class WordPatternTest extends AlgorithmsTest {
  "WordPattern" should "pass basic test" in {
    WordPattern.wordPattern("abba", "dog cat cat dog") should be (true)
    WordPattern.wordPattern("abba", "dog cat cat fish") should be (false)
    WordPattern.wordPattern("aaaa", "dog cat cat dog") should be (false)
    WordPattern.wordPattern("abba", "dog dog dog dog") should be (false)
    WordPattern.wordPattern("aaa", "aaa aa aa aa aa") should be (false)
  }
}
