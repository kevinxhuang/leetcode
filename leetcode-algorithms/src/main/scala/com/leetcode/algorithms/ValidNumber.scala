package com.leetcode.algorithms

/**
  */
object ValidNumber {
  def isNumber(s: String): Boolean = {
    if (!s.matches("[-+\\d\\.e\\s]+")) {
      return false
    }
    try {
      s.trim().toDouble
      true
    } catch {
      case _ : Throwable => false
    }
  }
}
