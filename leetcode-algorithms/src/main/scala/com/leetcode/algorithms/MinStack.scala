package com.leetcode.algorithms

/**
  * 155. Min Stack
  */
class MinStack() {
  import scala.collection.mutable

  val stack = new mutable.Stack[Int]()

  def push(x: Int) {
    stack.push(x)
  }

  def pop() {
    stack.pop()
  }

  def top(): Int = {
    stack.top
  }

  def getMin(): Int = {
    stack.min
  }
}
