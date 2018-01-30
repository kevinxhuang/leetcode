package com.leetcode.algorithms

/**
  * 401. Binary Watch
  *
  * https://leetcode.com/problems/binary-watch
  */
object BinaryWatch {
  def readBinaryWatch(num: Int): List[String] = {
    val hours = Map(
      0 -> Array("0"),
      1 -> Array("1", "2", "4", "8"),
      2 -> Array("3", "5", "6", "9", "10"),
      3 -> Array("7", "11"))
    val minutes = Map(
      0 -> Array("00"),
      1 -> Array("01", "02", "04", "08", "16", "32"),
      2 -> Array("03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"),
      3 -> Array("07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"),
      4 -> Array("15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"),
      5 -> Array("31", "47", "55", "59"))

    val timePairs = for(i <- 0 to num.min(3); j <- 0 to num.min(5) if (i + j) == num) yield (i, j)
    (for(pair <- timePairs; h <- hours(pair._1); m <- minutes(pair._2)) yield h + ":" + m).toList
  }
}
