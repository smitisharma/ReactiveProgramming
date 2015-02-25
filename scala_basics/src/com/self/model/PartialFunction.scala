package com.self.model

object PartialFunction extends App{
  
  def adder (m:Int, n:Int) = m+n
  
  val addTwoFunction  = adder(2, _:Int)  //applying function partially
  
  println(addTwoFunction(5))
  
   val partialFunction  = adder( _:Int, 5)
   println(partialFunction(10))
  

}