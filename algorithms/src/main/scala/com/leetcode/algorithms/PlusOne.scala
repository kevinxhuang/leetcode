package com.leetcode.algorithms

import scala.collection.mutable.ArrayBuffer

object PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val buffer = new ArrayBuffer[Int]()

    var carry = 1
    digits.reverse.foreach(d => {
      buffer += (d + carry) % 10
      carry = (d + carry) / 10
    })
    if(carry == 1) {
      buffer += carry
    }
    buffer.reverse.toArray
  }
}
