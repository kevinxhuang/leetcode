package com.leetcode.algorithms

/**
  * 223. Rectangle Area
  */
object RectangleArea {
  case class Point(x: Int, y: Int)
  case class Rectangle(leftCorner: Point, rightCorner: Point) {
    def area: Int = (rightCorner.x - leftCorner.x) * (rightCorner.y - leftCorner.y)
  }

  def computeArea(A: Int, B: Int, C: Int, D: Int, E: Int, F: Int, G: Int, H: Int): Int = {
    val rectangle1 = Rectangle(Point(A, B), Point(C, D))
    val rectangle2 = Rectangle(Point(E, F), Point(G, H))

    val overlapLeftCorner = Point(A.max(E), B.max(F))
    val overlapRightCorner = Point(C.min(G).max(overlapLeftCorner.x), D.min(H).max(overlapLeftCorner.y))
    val overlapRectangle = Rectangle(overlapLeftCorner, overlapRightCorner)

    rectangle1.area + rectangle2.area - overlapRectangle.area
  }
}
