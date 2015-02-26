package com.self.FunctionalComposition

/*So just what are case statements?

 case statement is subclass of function called a PartialFunction.*/
object PartialFunction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val one: PartialFunction[Int, String] = { case 1 => "one" }
                                                  //> one  : PartialFunction[Int,String] = <function1>
	one.isDefinedAt(1)                        //> res0: Boolean = true

	one.isDefinedAt(2)                        //> res1: Boolean = false

	one(1)                                    //> res2: String = one
	//one(2)
                                                  
  val two: PartialFunction[Int, String] = { case 2 => "two" }
                                                  //> two  : PartialFunction[Int,String] = <function1>
  
  val wildcard: PartialFunction[Int, String] = { case _ => "something else" }
                                                  //> wildcard  : PartialFunction[Int,String] = <function1>
  
  wildcard(3)                                     //> res3: String = something else
  
  val partial = one orElse two orElse  wildcard   //> partial  : PartialFunction[Int,String] = <function1>
 
  partial(1)                                      //> res4: String = one
  partial(3)                                      //> res5: String = something else
}