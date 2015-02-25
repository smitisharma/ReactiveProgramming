package com.self.model

object CurriedFunction extends App{

  def multiply(m: Int)(n: Int): Int = m * n
  
  println(multiply(2)(3))
  
  var multipleByTwoFunction = multiply(2)(_)
  println(multipleByTwoFunction(5))
  
  //You can take any function of multiple arguments and curry it.
  //two parameters of adder function will be applied later
  val curriedAdd = (PartialFunction.adder _).curried
  val AddTwo = curriedAdd(2)
  println(AddTwo(7))
}