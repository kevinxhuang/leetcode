package com.leetcode.algorithms

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 1054. Distant Barcodes
  */
object DistantBarcodes {
  def rearrangeBarcodes(barcodes: Array[Int]): Array[Int] = {
    val resultBuilder = new ArrayBuffer[Int]()

    val priorityQueue = new mutable.PriorityQueue[(Int, Int)]()(Ordering.by((_: (Int, Int))._2))

    barcodes.map((_, 1)).groupBy(_._1).mapValues(_.length).foreach(
      priorityQueue.enqueue(_)
    )

    while(priorityQueue.size > 1) {
      val (numA, countA) = priorityQueue.dequeue()
      val (numB, countB) = priorityQueue.dequeue()
      resultBuilder += numA
      resultBuilder += numB
      if(countA - 1 > 0) {
        priorityQueue.enqueue((numA, countA - 1))
      }

      if(countB - 1 > 0) {
        priorityQueue.enqueue((numB, countB - 1))
      }
    }

    if(priorityQueue.nonEmpty) {
      resultBuilder += priorityQueue.dequeue()._1
    }

    resultBuilder.toArray
  }
}
