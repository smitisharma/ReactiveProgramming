package com.self.patternMatching

object Example2 extends App {
  
  val times = 1
  
  val txt = times match {
    case i if i == 1 => "one"
    case i if i == 2  => "two"
    case _ => "random"
  }
  
  println("pattern matchign "+txt)

}