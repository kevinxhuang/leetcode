package com.leetcode.algorithms

class MyCircularQueueTest extends AlgorithmsTest {
  "MyCircularQueue" should "pass basic test" in {
    val circularQueue = new MyCircularQueue(3); // set the size to be 3
    circularQueue.enQueue(1) should be (true)
    circularQueue.enQueue(2) should be (true)
    circularQueue.enQueue(3) should be (true)
    circularQueue.enQueue(4) should be (false)
    circularQueue.Rear() should be (3)
    circularQueue.isFull() should be (true)
    circularQueue.deQueue() should be (true)
    circularQueue.enQueue(4) should be (true)
    circularQueue.Rear() should be (4)
  }
}
