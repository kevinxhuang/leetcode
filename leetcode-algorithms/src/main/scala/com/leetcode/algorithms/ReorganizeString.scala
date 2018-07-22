package com.leetcode.algorithms


/**
  * 767. Reorganize String
  *
  * https://leetcode.com/problems/reorganize-string
  */
object ReorganizeString {
  import scala.collection.mutable
  def reorganizeString(S: String): String = {
    val charStatistics = S.map((_, 1)).groupBy(_._1).mapValues(_.map(_._2).sum)
    val charHeap = new mutable.PriorityQueue[(Char, Int)]()(Ordering.by[(Char, Int), Int](_._2))
    charHeap.enqueue(charStatistics.toSeq: _*)

    val reorganizedStringBuilder = new mutable.StringBuilder()
    while(charHeap.nonEmpty) {
      if(charHeap.head._2 > ((S.length - reorganizedStringBuilder.size + 1) / 2)) {
        return ""
      } else {
        if(charHeap.size == 1) {
          val char = charHeap.dequeue()
          if(char._2 > 1) {
            return ""
          } else {
            reorganizedStringBuilder.append(char._1)
          }
        } else {
          var char = charHeap.dequeue()
          if(reorganizedStringBuilder.nonEmpty && char._1 == reorganizedStringBuilder.last) {
            val theSameChar = char
            char = charHeap.dequeue()
            charHeap.enqueue(theSameChar)
          }
          reorganizedStringBuilder.append(char._1)
          char = (char._1, char._2 - 1)
          if(char._2 > 0) {
            charHeap.enqueue(char)
          }
        }
      }
    }

    reorganizedStringBuilder.mkString
  }
}
