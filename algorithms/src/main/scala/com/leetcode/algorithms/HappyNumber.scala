package com.leetcode.algorithms

object HappyNumber {
  def isHappy(n: Int): Boolean = {
    def squaresOfDigits(num: Int): Int = {
      var tmp = num
      var result = 0
      while(tmp > 0) {
        result += (tmp % 10) * (tmp % 10)
        tmp = tmp / 10
      }

      result
    }

    var slow = n
    var fast = n
    do {
      slow = squaresOfDigits(slow)
      fast = squaresOfDigits(squaresOfDigits(fast))
    } while(slow != fast)

    slow == 1
  }
}
