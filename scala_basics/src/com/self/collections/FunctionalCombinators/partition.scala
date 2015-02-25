package com.self.collections.FunctionalCombinators

//partition splits a list based on where it falls with respect to a predicate function.
object partition extends App{
  
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println("Partition list "+numbers.partition(_ % 2 == 0))

}