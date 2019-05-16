package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 20. Valid Parentheses
  */
object ValidParentheses {
  def isValid(s: String): Boolean = {
    s match {
      case "" => true
      case `s` if s.length < 2 => false
      case _ => {
        val stack = new mutable.Stack[Char]()
        val bracketReversedMap = Map(')' -> '(', ']' -> '[', '}' -> '{')
        s.foreach {
          case c@('(' | '[' | '{') => stack.push(c)
          case c@(')' | ']' | '}') => {
            if(stack.isEmpty || stack.pop() != bracketReversedMap(c)) {
              return false
            }
          }
          case _ => //do nothing
        }

        stack.isEmpty
      }
    }
  }
}
