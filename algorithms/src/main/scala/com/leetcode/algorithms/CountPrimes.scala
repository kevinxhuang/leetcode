package com.leetcode.algorithms

import scala.math.{sqrt, ceil}

/**
  * 204. Count Primes
  */
object CountPrimes {
  def countPrimes(n: Int): Int = {
    if(n <= 2) {
      0
    } else {
      val isPrimes = Array.fill[Boolean](n)(true)
      isPrimes(0) = false
      isPrimes(1) = false
      for(i <- 2 to ceil(sqrt(n)).toInt) {
        if(isPrimes(i)) {
          for(j <- (i + i) until n by i if isPrimes(j)) {
            isPrimes(j) = false
          }
        }
      }

      isPrimes.count(_ == true)
    }
  }
}
