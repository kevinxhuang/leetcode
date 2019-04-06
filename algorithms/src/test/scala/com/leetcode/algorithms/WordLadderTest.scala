package com.leetcode.algorithms

class WordLadderTest extends AlgorithmsTest {
  "WordLadder" should "pass basic tests" in {
    WordLadder.ladderLength("hit", "cog", List("hot","dot","dog","lot","log","cog")) shouldBe 5
    WordLadder.ladderLength("hit", "cog", List("hot","dot","dog","lot","log")) shouldBe 0
  }
}
