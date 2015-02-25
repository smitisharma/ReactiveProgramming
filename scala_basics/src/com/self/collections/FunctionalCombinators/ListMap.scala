package com.self.collections.FunctionalCombinators

/*List(1, 2, 3) map squared applies the function squared to the elements of the list, returning a new list, perhaps List(1, 4, 9). */
/* In all the following cases actual List will remain the same.*/
object ListMap extends App{

  var numbers  = List(1,2,3)
  var squaredNum = numbers.map((i: Int) => i * 2)
  println(squaredNum)
  
  //foreach is like map but returns nothing. foreach is intended for side-effects only.
  var willReturn = numbers.foreach((i: Int) => i * 2)
  println(willReturn)

  
  
   var strings  = List("a","b","c")
  var newStrings = strings.map((i: String) => i + "*")
  println(newStrings)
}