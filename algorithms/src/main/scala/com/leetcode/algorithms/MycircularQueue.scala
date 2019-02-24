package com.leetcode.algorithms

/**
  * 622. Design Circular Queue
  *
  * https://leetcode.com/problems/design-circular-queue
  */
class MyCircularQueue(_k: Int) {
  /** Initialize your data structure here. Set the size of the queue to be k. */
  val elements = Array.fill[Int](_k)(0)
  var front = 0
  var rear = -1
  var size = 0

  /** Insert an element into the circular queue. Return true if the operation is successful. */
  def enQueue(value: Int): Boolean = {
    if(isFull()) {
      false
    } else {
      rear = (rear + 1) % _k
      elements(rear) = value
      size += 1
      true
    }
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  def deQueue(): Boolean = {
    if(isEmpty()) {
      false
    } else {
      front = (front + 1) % _k
      size -= 1
      true
    }
  }

  /** Get the front item from the queue. */
  def Front(): Int = {
    if(isEmpty()) {
      -1
    } else {
      elements(front)
    }
  }

  /** Get the last item from the queue. */
  def Rear(): Int = {
    if(isEmpty()) {
      -1
    } else {
      elements(rear)
    }
  }

  /** Checks whether the circular queue is empty or not. */
  def isEmpty(): Boolean = {
    size == 0
  }

  /** Checks whether the circular queue is full or not. */
  def isFull(): Boolean = {
   size == _k
  }
}
