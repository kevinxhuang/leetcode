package com.leetcode.algorithms

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 1190. Reverse Substrings Between Each Pair of Parentheses
  */
object ReverseSubstringsBetweenEachPairOfParentheses {
  def reverseParentheses(s: String): String = {
    val stack = new mutable.Stack[Char]()
    s.toCharArray.foreach {
      case ')' =>
        val strBuffer = new ArrayBuffer[Char]()
        while (stack.nonEmpty && stack.top != '(') {
          strBuffer += stack.pop()
        }
        if (stack.nonEmpty && stack.top == '(') {
          stack.pop()
        }

        stack.pushAll(strBuffer)
      case c => stack.push(c)
    }

    stack.reverse.mkString("")
  }
}
