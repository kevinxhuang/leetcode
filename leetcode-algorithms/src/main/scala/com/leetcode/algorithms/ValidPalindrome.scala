package com.leetcode.algorithms

/**
  * 125. Valid Palindrome
  *
  * https://leetcode.com/problems/valid-palindrome
  */
object ValidPalindrome {
  def isPalindrome(s: String): Boolean = {
    val filteredString = s.filter(_.isLetterOrDigit)
    if (filteredString.length == 0) {
      return true
    }
    // Compile time limit exceeded on leetcode.
//    (for(i <- 0 to filteredString.length / 2)
//      yield filteredString(i) == filteredString(filteredString.length - i - 1)).reduceLeft((acc, n) => acc && n)
    for(i <- 0 to filteredString.length / 2) {
      if(filteredString(i).toLower != filteredString(filteredString.length - i - 1).toLower) {
        return false
      }
    }
    return true
  }
}
