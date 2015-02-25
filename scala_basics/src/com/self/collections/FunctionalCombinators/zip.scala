package com.self.collections.FunctionalCombinators

/*zip aggregates the contents of two lists into a single list of pairs.*/
object zip extends App{
  
  var zippedList = List(1, 2, 3).zip(List("a", "b", "c"))
  
  println(zippedList)
  
   var oddCountList = List(1, 2, 3).zip(List("a", "b"))
   
    println(oddCountList)

}