package com.leetcode.algorithms

import scala.collection.mutable

class MedianFinder() {
  private val maxHeap = new mutable.PriorityQueue[Int]()
  private val minHeap = new mutable.PriorityQueue[Int]()(Ordering[Int].reverse)

  def addNum(num: Int): Unit = {
    if(maxHeap.isEmpty || num < maxHeap.head) {
      maxHeap.enqueue(num)
    } else {
      minHeap.enqueue(num)
    }

    if(!isBalanced()) {
      if(maxHeap.size > minHeap.size) {
        minHeap.enqueue(maxHeap.dequeue())
      } else {
        maxHeap.enqueue(minHeap.dequeue())
      }
    }
  }

  def findMedian(): Double = {
    if(maxHeap.size == minHeap.size) {
      (maxHeap.head + minHeap.head) / 2.0
    } else if(maxHeap.size > minHeap.size){
      maxHeap.head
    } else {
      minHeap.head
    }
  }

  private def isBalanced(): Boolean = {
    (maxHeap.size - minHeap.size).abs <= 1
  }
}
