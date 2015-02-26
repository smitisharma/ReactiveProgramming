package com.self.TypeAndPolymorphism

object scalaTypes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 var random = 2 :: 1 :: "bar" :: "foo" :: Nil     //> random  : List[Any] = List(2, 1, bar, foo)
  random.head                                     //> res0: Any = 2
  
  //[A] refers to generics
   def drop1[A](l: List[A]) = l.tail              //> drop1: [A](l: List[A])List[A]
   
   drop1(List(1,2,3))                             //> res1: List[Int] = List(2, 3)
   
   //rank-1 polymorphism
   //toList will treat arguments as single element only
   def toList[A](a: A) = List(a)                  //> toList: [A](a: A)List[A]
   toList(2)                                      //> res2: List[Int] = List(2)
   toList(2,3)                                    //> res3: List[(Int, Int)] = List((2,3))

//ERROR type mismatch
	//def foo[A, B](f: A => List[A], b: B) = f(b)
	
	//ERROR type mismatch : found Int , required A
	//def foo[A](f: A => List[A], b: Int) = f(b:Int)

  //Only one unknown type(Any in scala) can be used
	def foo[A](f: A => List[A], b: A) = f(b)  //> foo: [A](f: A => List[A], b: A)List[A]

}