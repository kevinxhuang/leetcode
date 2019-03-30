package com.leetcode.algorithms

import scala.annotation.tailrec

/**
  * 914. X of a Kind in a Deck of Cards
  */
object XOfAKindInADeckOfCards {
  @tailrec
  def gcd(a: Int,b: Int): Int = {
    if(b ==0) a else gcd(b, a%b)
  }

  def hasGroupsSizeX(deck: Array[Int]): Boolean = {
    val stats = deck.groupBy(n => n).map({case (key, array) => (key, array.length)})

    val smallestGroup = stats.values.foldLeft(stats.values.head)({case (num1, num2) => gcd(num1, num2)})
    if(smallestGroup >= 2) {
      stats.values.forall(_ % smallestGroup == 0)
    } else {
      false
    }
  }
}
