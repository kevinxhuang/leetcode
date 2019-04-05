package com.leetcode.algorithms

class MostCommonWordTest extends AlgorithmsTest {
  "MostCommonWord" should "pass basic test" in {
    MostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", Array("hit")) shouldBe "ball"
    MostCommonWord.mostCommonWord("a, a, a, a, b,b,b,c, c", Array("a")) shouldBe "b"
  }
}
