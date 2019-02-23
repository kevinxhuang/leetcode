package com.leetcode.algorithms

class ReplaceWordsTest extends AlgorithmsTest {
  "ReplaceWords" should "pass basic test" in {
    ReplaceWords.replaceWords(List("cat", "bat", "rat"), "the cattle was rattled by the battery") should be ("the cat was rat by the bat")
    ReplaceWords.replaceWords(List("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa") should be ("a a a a a a a a bbb baba a")
  }
}
