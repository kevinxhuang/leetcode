package com.leetcode.algorithms


/**
  * 729. My Calendar I
  *
  */
class MyCalendarI {
  import scala.collection.mutable.ArrayBuffer

  private var events = new ArrayBuffer[(Int, Int)]

  def book(start: Int, end: Int): Boolean = {
    if(events.exists(event => (start >= event._1 && start < event._2)
      || (end > event._1 && end <= event._2)
      || (start < event._1 && end > event._1) )) {
      false
    } else {
      events += ((start, end))
      true
    }
  }
}
