package com.leetcode.algorithms

/**
  * 682. Baseball Game
  */
object BaseballGame {
  import scala.collection.mutable

  def calPoints(ops: Array[String]): Int = {
    val stack = new mutable.Stack[Int]()
    ops.foreach {
      case "C" => stack.pop()
      case "D" => stack.push(stack.top * 2)
      case "+" => stack.push(stack.take(2).sum)
      case score => stack.push(score.toInt)
      case _ => new RuntimeException("Invalid input")
    }

    stack.sum
  }
}
