package com.leetcode.algorithms

object MostCommonWord {
  def mostCommonWord(paragraph: String, banned: Array[String]): String = {
    val bannedWordSet = banned.toSet
    val words = paragraph
      .split("[!\\?',;\\.\\s]+")
      .map(_.trim().toLowerCase)
      .filter(_.nonEmpty)
      .filterNot(bannedWordSet.contains)

    words.map((_, 1))
      .groupBy(_._1)
      .mapValues(values => values.map(_._2).sum)
      .maxBy(_._2)._1
  }
}
