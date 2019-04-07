package com.leetcode.algorithms

class MedianFinderTest extends AlgorithmsTest {
  "MedianFinder" should "pass basic test" in {
    val medianFinder = new MedianFinder()
    medianFinder.addNum(1)
    medianFinder.addNum(2)
    medianFinder.findMedian() shouldBe 1.5
    medianFinder.addNum(3)
    medianFinder.findMedian() shouldBe 2
  }
}
