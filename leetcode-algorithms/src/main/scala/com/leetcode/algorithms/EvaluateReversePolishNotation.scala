package com.leetcode.algorithms

/**
  * 150. Evaluate Reverse Polish Notation
  */
object EvaluateReversePolishNotation {
  import scala.collection.mutable

  def evalRPN(tokens: Array[String]): Int = {
    val stack = new mutable.Stack[Int]()

    tokens.foreach(token =>{
      if(isOperator(token)) {
        val rightOperand = stack.pop()
        val leftOperand = stack.pop()
        stack.push(calculate(leftOperand, rightOperand, token))
      } else {
        stack.push(token.toInt)
      }
    })

    stack.top
  }

  private def calculate(leftOperand: Int, rightOperand: Int, operator: String): Int = {
    operator match {
      case "+" => leftOperand + rightOperand
      case "-" => leftOperand - rightOperand
      case "*" => leftOperand * rightOperand
      case "/" => leftOperand / rightOperand
      case _ => throw new RuntimeException("Unsupported operator")
    }
  }

  private def isOperator(token: String): Boolean = {
    token match {
      case "+" | "-" | "*" | "/" => true
      case _ => false
    }
  }
}
