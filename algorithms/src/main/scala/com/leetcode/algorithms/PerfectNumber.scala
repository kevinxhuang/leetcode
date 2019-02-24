package com.leetcode.algorithms

import scala.collection.mutable.ArrayBuffer

/**
  * 507. Perfect Number
  */
object PerfectNumber {
  def checkPerfectNumber(num: Int): Boolean = {
    if (num == 1) {
      false
    } else {
      num == getDivisors(num).sum
    }
  }

  private def getDivisors(num: Int): Seq[Int] = {
    val divisors = new ArrayBuffer[Int]()
    divisors += 1
    for(i <- 2 to math.sqrt(num).toInt) {
      if(num % i == 0) {
        if(num/i == i) {
          divisors += i
        } else {
          divisors += i
          divisors += num/i
        }
      }
    }

    divisors
  }
}
