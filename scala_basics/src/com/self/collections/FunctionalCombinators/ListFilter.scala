package com.self.collections.FunctionalCombinators

/*removes any elements where the function you pass in evaluates to false. Functions that return a
 *  Boolean are often called predicate functions.*/
object ListFilter extends App{
  
  var numbers = List(1,2,3)
 
   var filteredNumbers = numbers.filter( (i:Int) =>  (i%2==0) )
   
   println(filteredNumbers)
}