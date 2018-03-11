package com.leetcode.algorithms

/**
  * 500. Keyboard Row
  */
object KeyboardRow {
  val KEYBOARD = Array(
    "qwertyuiopQWERTYUIOP",
    "asdfghjklASDFGHJKL",
    "zxcvbnmZXCVBNM"
  )
  def findWords(words: Array[String]): Array[String] = {
    words.filter(word => {
      word.forall(c => KEYBOARD(0).contains(c)) || word.forall(c => KEYBOARD(1).contains(c)) || word.forall(c => KEYBOARD(2).contains(c))
    })
  }
}
