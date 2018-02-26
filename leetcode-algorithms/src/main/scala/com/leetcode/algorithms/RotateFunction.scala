package com.leetcode.algorithms

/**
  * 396. Rotate Function
  *
  * https://leetcode.com/problems/rotate-function
  *
  * Inspired by https://leetcode.com/problems/rotate-function/discuss/87853/Java-O(n)-solution-with-explanation
  *
  * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]
    F(k-1) = 0 * Bk-1[0] + 1 * Bk-1[1] + ... + (n-1) * Bk-1[n-1]
           = 0 * Bk[1] + 1 * Bk[2] + ... + (n-2) * Bk[n-1] + (n-1) * Bk[0]
    =>
    F(k) - F(k-1) = Bk[1] + Bk[2] + ... + Bk[n-1] + (1-n)Bk[0]
                  = (Bk[0] + ... + Bk[n-1]) - nBk[0]
                  = sum - nBk[0]
    =>
    F(k) = F(k-1) + sum - nBk[0]
         = F(k-1) + sum - n * A[n-k]
  */
object RotateFunction {
  def maxRotateFunction(A: Array[Int]): Int = {
    if (A.length > 0) {
      val sum = A.sum
      var current = A.zipWithIndex.map(e => e._1 * e._2).sum
      var maxValue = current
      for(k <- A.indices.tail) {
        val previous = current
        current = previous + sum - A.length * A(A.length - k)
        maxValue = maxValue.max(current)
      }
      maxValue
    } else {
      0
    }
  }
}
