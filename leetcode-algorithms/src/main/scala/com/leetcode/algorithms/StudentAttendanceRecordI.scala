package com.leetcode.algorithms

/**
  * https://leetcode.com/problems/student-attendance-record-i
  */
object StudentAttendanceRecordI {
  def checkRecord(s: String): Boolean = {
    s.count(_ == 'A') <= 1 && !s.contains("LLL")
  }
}
