package com.leetcode.algorithms

class ValidNumberTest extends AlgorithmsTest {
  "ValidNumber" should "pass basic test" in {
    ValidNumber.isNumber("0") should be (true)
    ValidNumber.isNumber(" 0.1 ") should be (true)
    ValidNumber.isNumber("abc") should be (false)
    ValidNumber.isNumber("1 a") should be (false)
    ValidNumber.isNumber("2e10") should be (true)
    ValidNumber.isNumber("959440.94f") should be (false)
    ValidNumber.isNumber("-1.") should be (true)
    ValidNumber.isNumber("+.8") should be (true)
  }
}
