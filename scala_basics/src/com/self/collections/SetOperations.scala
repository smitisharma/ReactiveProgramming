package com.self.collections

object SetOperations extends App{
  
	val fruit1 = Set("apples", "oranges", "pears")
      val fruit2 = Set("mangoes", "banana")
       val fruit3 = Set("mangoes","cherry")

      // use two or more sets with ++ as operator
      var fruit = fruit1 ++ fruit2 ++ fruit3 
      println( "fruit1 ++ fruit2 ++ fruit3  : " + fruit )

      // use two sets with ++ as method
      fruit = fruit1.++(fruit2)
      println( "fruit1.++(fruit2) : " + fruit )
      
      println("Min "+fruit.min+" Max "+fruit.max)
      
      //Find common values in Sets:
      println(fruit2.&(fruit3))
      println(fruit2.intersect(fruit3))
}