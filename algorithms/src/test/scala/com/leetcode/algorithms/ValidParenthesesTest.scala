package com.leetcode.algorithms

class ValidParenthesesTest extends AlgorithmsTest {
  "ValidParentheses" should "pass basic test 1" in {
    ValidParentheses.isValid("()") shouldBe true
  }

  "ValidParentheses" should "pass basic test 2" in {
    ValidParentheses.isValid("()[]{}") shouldBe true
  }

  "ValidParentheses" should "pass basic test 3" in {
    ValidParentheses.isValid("(]") shouldBe false
  }

  "ValidParentheses" should "pass basic test 4" in {
    ValidParentheses.isValid("([)]") shouldBe false
  }

  "ValidParentheses" should "pass basic test 5" in {
    ValidParentheses.isValid("{[]}") shouldBe true
  }

  "ValidParentheses" should "pass if it only have one character" in {
    ValidParentheses.isValid("]") shouldBe false
  }

  "ValidParentheses" should "pass if it have two character" in {
    ValidParentheses.isValid("){") shouldBe false
  }

  "ValidParentheses" should "pass if there is no any character" in {
    ValidParentheses.isValid("){") shouldBe false
  }
}
