package com.leetcode.algorithms

class MyCalendarITest extends AlgorithmsTest {
  "MyCalendarI" should "pass basic test" in {
    val calendar = new MyCalendarI()
    calendar.book(10, 20) should be (true)
    calendar.book(15, 25) should be (false)
    calendar.book(20, 30) should be (true)
  }
}
