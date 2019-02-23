package com.leetcode.algorithms

class BinaryWatchTest extends AlgorithmsTest {
  "BinaryWatch" should "pass basic test" in {
    BinaryWatch.readBinaryWatch(1).sorted should be (List("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32").sorted)
    BinaryWatch.readBinaryWatch(8).sorted should be (List("7:31","7:47","7:55","7:59","11:31","11:47","11:55","11:59").sorted)
  }
}
