package com.leetcode.algorithms

object FirstUniqueCharacterInAString {
  def firstUniqChar(s: String): Int = {
    var stats = Array.fill[Int](26)(0)
    s.foreach(c => stats(c - 'a') +=1)
    s.indices.foreach(i => if(stats(s(i) - 'a') == 1) return i)
    -1
  }
}
