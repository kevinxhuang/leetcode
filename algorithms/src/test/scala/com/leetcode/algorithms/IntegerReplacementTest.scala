package com.leetcode.algorithms

class IntegerReplacementTest extends AlgorithmsTest {
  "IntegerReplacement" should "pass basic test" in {
    IntegerReplacement.integerReplacement(8) should be (3)
    IntegerReplacement.integerReplacement(7) should be (4)
    IntegerReplacement.integerReplacement(1) should be (0)
  }
}
