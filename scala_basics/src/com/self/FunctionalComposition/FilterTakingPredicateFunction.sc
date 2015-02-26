package com.self.FunctionalComposition

object FilterTakingPredicateFunction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  case class PhoneExt(name: String, ext: Int)
  
  //while creating object of case class we dont need to use new()
  val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))
                                                  //> extensions  : List[com.self.FunctionalComposition.FilterTakingPredicateFunct
                                                  //| ion.PhoneExt] = List(PhoneExt(steve,100), PhoneExt(robey,200))
 
 
  //filter takes a function. In this case a predicate function of (PhoneExt) => Boolean.
  extensions.filter{case PhoneExt(name, extension) => (extension < 200)}
                                                  //> res0: List[com.self.FunctionalComposition.FilterTakingPredicateFunction.Phon
                                                  //| eExt] = List(PhoneExt(steve,100))
}