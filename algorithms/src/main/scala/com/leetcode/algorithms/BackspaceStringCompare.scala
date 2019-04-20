package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 844. Backspace String Compare
  */
object BackspaceStringCompare {
  def backspaceCompare(S: String, T: String): Boolean = {
    getFinalString(S) == getFinalString(T)
  }

  private def getFinalString(str: String): String = {
    val stack = new mutable.Stack[Char]()
    str.toCharArray.foreach(c => {
      if(c == '#' && stack.nonEmpty) {
        stack.pop()
      } else if(c != '#') {
        stack.push(c)
      }
    })

    stack.mkString("").reverse
  }
}
