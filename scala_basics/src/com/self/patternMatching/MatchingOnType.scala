package com.self.patternMatching

object MatchingOnType extends App{

  def bigger(o: Any): Any = {
  o match {
    case i: Int if i < 0 => i - 1
    case i: Int => i + 1
    case d: Double if d < 0.0 => d - 0.1
    case d: Double => d + 0.1
    case text: String => text + "s"
  }
}
  println("bigger "+bigger(-1))
  println("bigger "+bigger(1))
  println("bigger "+bigger(-1.1))
  println("bigger "+bigger(1.1))
  println("bigger "+bigger("ab"))
}