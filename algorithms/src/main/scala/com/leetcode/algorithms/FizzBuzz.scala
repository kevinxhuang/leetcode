package com.leetcode.algorithms

/**
  * 412. Fizz Buzz
  */
object FizzBuzz {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).map(i => {
      if(i % 15 == 0) {
        "FizzBuzz"
      } else if(i % 3 == 0) {
        "Fizz"
      } else if(i % 5 == 0) {
        "Buzz"
      } else {
        i.toString
      }
    }).toList
  }
}
