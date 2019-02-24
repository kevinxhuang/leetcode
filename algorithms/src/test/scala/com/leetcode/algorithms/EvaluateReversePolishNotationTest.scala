package com.leetcode.algorithms

class EvaluateReversePolishNotationTest extends AlgorithmsTest {
  "EvaluateReversePolishNotation" should "pass basic test" in {
    EvaluateReversePolishNotation.evalRPN(Array("2","1","+","3","*")) should be (9)
    EvaluateReversePolishNotation.evalRPN(Array("4", "13", "5", "/", "+")) should be (6)
    EvaluateReversePolishNotation.evalRPN(Array("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")) should be (22)
  }
}
