package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 38. Count and Say
  */
object CountAndSay {
  def countAndSay(n: Int): String = {
    if(n == 1) {
      "1"
    } else {
      (2 to n).foldLeft("1")((acc, _) => _countAndSay(acc))
    }
  }

  private def _countAndSay(n: String): String = {
    val stack = new mutable.Stack[(Char, Int)]()
    n.toString.foreach(digit =>
      if(stack.isEmpty) {
        stack.push((digit, 1))
      } else {
        val top = stack.top._1
        if(top == digit) {
          stack.push((digit, stack.pop()._2 + 1))
        } else {
          stack.push((digit, 1))
        }
      }
    )

    stack.reverse.map({case (digit, count) => s"$count$digit"}).mkString("")
  }
}
