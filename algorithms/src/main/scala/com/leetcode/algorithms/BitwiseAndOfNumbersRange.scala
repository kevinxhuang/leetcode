package com.leetcode.algorithms

/**
  * 201. Bitwise AND of Numbers Range
  */
object BitwiseAndOfNumbersRange {
  def rangeBitwiseAnd(m: Int, n: Int): Int = {
    if(m == 0) {
      0
    } else {
      var bitM = m
      var bitN = n
      var moveFactor = 1
      while(bitM != bitN) {
        bitM = bitM >> 1
        bitN = bitN >> 1
        moveFactor = moveFactor << 1
      }
      bitM * moveFactor
    }
  }
}
