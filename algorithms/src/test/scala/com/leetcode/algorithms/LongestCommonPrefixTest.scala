package com.leetcode.algorithms

class LongestCommonPrefixTest extends AlgorithmsTest {
  "LongestCommonPrefix" should "pass basic test" in {
    LongestCommonPrefix.longestCommonPrefix(Array("flower","flow","flight")) should be ("fl")
    LongestCommonPrefix.longestCommonPrefix(Array("dog","racecar","car")) should be ("")
    LongestCommonPrefix.longestCommonPrefix(Array()) should be ("")
    LongestCommonPrefix.longestCommonPrefix(Array("")) should be ("")
    LongestCommonPrefix.longestCommonPrefix(Array("a")) should be ("a")
    LongestCommonPrefix.longestCommonPrefix(Array("a", "b")) should be ("")
    LongestCommonPrefix.longestCommonPrefix(Array("a", "a")) should be ("a")
  }
}
