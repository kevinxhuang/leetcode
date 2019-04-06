package com.leetcode.algorithms

import scala.collection.mutable

/**
  * 127. Word Ladder
  */
object WordLadder {
  def ladderLength(beginWord: String, endWord: String, wordList: List[String]): Int = {
    val shortestPath = new mutable.HashMap[String, Int]()
    val queue = new mutable.Queue[String]()
    val visited = new mutable.HashSet[String]()
    val wordSet = wordList.toSet

    queue.enqueue(beginWord)
    while(queue.nonEmpty) {
      val word = queue.dequeue()
      visited.add(word)
      shortestPath.getOrElseUpdate(word, 1)

      val tranformedWords = word.indices
        .flatMap(index => ('a' to 'z').map(word.substring(0, index) + _ + word.substring(index + 1)))
        .filter(wordSet.contains)

      tranformedWords
        .filterNot(visited.contains)
        .foreach(w => {
          shortestPath.update(w, (shortestPath(word) + 1).min(shortestPath.getOrElse(w, Int.MaxValue)))
          queue.enqueue(w)
        })
    }

    shortestPath.getOrElse(endWord, 0)
  }
}
