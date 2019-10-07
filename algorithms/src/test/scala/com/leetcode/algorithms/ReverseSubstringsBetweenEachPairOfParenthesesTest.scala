package com.leetcode.algorithms

class ReverseSubstringsBetweenEachPairOfParenthesesTest extends AlgorithmsTest {
  "ReverseSubstringsBetweenEachPairOfParentheses" should "pass basic test 1" in {
    ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(abcd)") shouldBe "dcba"
  }

  "ReverseSubstringsBetweenEachPairOfParentheses" should "pass basic test 2" in {
    ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(u(love)i)") shouldBe "iloveu"
  }

  "ReverseSubstringsBetweenEachPairOfParentheses" should "pass basic test 3" in {
    ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(ed(et(oc))el)") shouldBe "leetcode"
  }

  "ReverseSubstringsBetweenEachPairOfParentheses" should "pass basic test 4" in {
    ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("a(bcdefghijkl(mno)p)q") shouldBe "apmnolkjihgfedcbq"
  }
}
