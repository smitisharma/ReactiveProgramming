package com.self.FunctionalComposition

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //COMPOSE
  
  def f(s: String) = "f(-" + s + ")"              //> f: (s: String)String
  println(f("abc"))                               //> f(-abc)
  
   def g(s: String) = "g(" + s + ")"              //> g: (s: String)String
   
   //compose makes a new function that composes other functions f(g(x))
   val fComposeG = f _ compose g _                //> fComposeG  : String => String = <function1>
  fComposeG("yay")                                //> res0: String = f(-g(yay))
  
  //andThen is like compose, but calls the first function and then the second, g(f(x))
  val fAndThenG = f _ andThen g _                 //> fAndThenG  : String => String = <function1>
  fAndThenG("abc")                                //> res1: String = g(f(-abc))
}