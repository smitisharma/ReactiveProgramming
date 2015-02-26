package com.self.TypeAndPolymorphism

object Variance {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Covariant[+A]
  
  val cv: Covariant[AnyRef] = new Covariant[String]
                                                  //> cv  : com.self.TypeAndPolymorphism.Variance.Covariant[AnyRef] = com.self.Typ
                                                  //| eAndPolymorphism.Variance$$anonfun$main$1$Covariant$1@2a5f1994
	//TYPE MISMATCH ERROR
	//val cv1: Covariant[String] = new Covariant[AnyRef]
	
	class Contravariant[-A]
	
		//TYPE MISMATCH ERROR
	//val cv2: Contravariant[AnyRef] = new Contravariant[String]
	
	val cv3: Contravariant[String] = new Contravariant[AnyRef]
                                                  //> cv3  : com.self.TypeAndPolymorphism.Variance.Contravariant[String] = com.sel
                                                  //| f.TypeAndPolymorphism.Variance$$anonfun$main$1$Contravariant$1@169d6a08
                                                  
   val cv4: Contravariant[AnyRef] = new Contravariant[AnyRef]
                                                  //> cv4  : com.self.TypeAndPolymorphism.Variance.Contravariant[AnyRef] = com.sel
                                                  //| f.TypeAndPolymorphism.Variance$$anonfun$main$1$Contravariant$1@389c3ed1

	class Animal { val sound = "rustle" }
	
	class Bird extends Animal { override val sound = "call" }
	
	class Chicken extends Bird { override val sound = "cluck" }
}