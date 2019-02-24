package com.leetcode.algorithms

/**
  * 922. Sort Array By Parity II
  *
  * https://leetcode.com/problems/sort-array-by-parity-ii
  */
object SortArrayByParityII {
  def sortArrayByParityII(A: Array[Int]): Array[Int] = {
    val oddNums = A.filter(_%2 != 0)
    val evenNums = A.filter(_%2 == 0)
    evenNums.zip(oddNums).flatMap(kv => Seq(kv._1, kv._2))
  }
}
