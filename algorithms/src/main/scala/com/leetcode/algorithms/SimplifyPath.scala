package com.leetcode.algorithms

/**
  * 71. Simplify Path
  *
  * https://leetcode.com/problems/simplify-path
  */
object SimplifyPath {
  import scala.collection.mutable

  def simplifyPath(path: String): String = {
    val stack = new mutable.Stack[String]
    path.replaceAll("\\/\\/", "/").split('/').filter(_.nonEmpty).filterNot(_ == ".")
      .foreach(token => {
        if(token == "..") {
          if(stack.nonEmpty) {
            stack.pop
          }
        } else {
          stack.push(token)
        }
      })

    "/" + stack.reverse.mkString("/")
  }
}
