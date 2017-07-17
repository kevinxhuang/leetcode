package com.leetcode.algorithms

/**
  * 5. Longest Palindromic Substring
  *
  * https://leetcode.com/problems/longest-palindromic-substring
  */
object LongestPalindromicSubstring {
  def longestPalindrome(s: String): String = {
    if (s.length == 0) {
      return s
    }

    val palindrome = Array.ofDim[Int](s.length, s.length)
    var lengthOfPalindrome = 0
    var longestPalindrome: (Int, Int) = (0, 0)
    for(l <- 0 until s.length; i <- 0 until s.length if i + l < s.length) {
      val j = i + l
      if (i == j) {
        palindrome(i)(j) = 1
      } else if (i + 1 == j && s(i) == s(j)) {
        palindrome(i)(j) = 2
      } else if (palindrome(i+1)(j-1) > 0 && s(i) == s(j)) {
        palindrome(i)(j) = palindrome(i+1)(j-1) + 2
      } else {
        palindrome(i)(j) = 0
      }

      if (palindrome(i)(j) > lengthOfPalindrome) {
        lengthOfPalindrome = palindrome(i)(j)
        longestPalindrome = (i, j)
      }
    }

    return s.substring(longestPalindrome._1, longestPalindrome._2 + 1)
  }
}
