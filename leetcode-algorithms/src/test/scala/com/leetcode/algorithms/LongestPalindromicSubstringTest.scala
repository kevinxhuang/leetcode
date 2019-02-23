package com.leetcode.algorithms

class LongestPalindromicSubstringTest extends AlgorithmsTest {
  "LongestPalindromicSubstring" should "pass basic test" in {
    LongestPalindromicSubstring.longestPalindrome("babad") should be ("bab")
    LongestPalindromicSubstring.longestPalindrome("cbbd") should be ("bb")
    LongestPalindromicSubstring.longestPalindrome("") should be ("")
    LongestPalindromicSubstring.longestPalindrome("a") should be ("a")
  }
}
