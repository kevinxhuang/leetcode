package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 394. Decode String
  */
object DecodeString {
  def decodeString(s: String): String = {
    val numStack = new mutable.Stack[Int]()
    val numBuffer = new mutable.ArrayBuffer[Char]()
    val charStack = new mutable.Stack[String]()
    val charBuffer = new mutable.ArrayBuffer[String]()

    ("1[" + s + "]").foreach {
        case '[' =>
          charStack.push("[")
          numStack.push(numBuffer.mkString("").toInt)
          numBuffer.clear()
        case ']' =>
          var str = charStack.pop()
          while (str != "[") {
            charBuffer += str
            str = charStack.pop()
          }
          charStack.push(charBuffer.reverse.mkString("") * numStack.pop())
          charBuffer.clear()
        case char: Char if char >= '0' && char <= '9' => numBuffer += char
        case char: Char => charStack.push(char.toString)
      }

    charStack.pop()
  }
}
