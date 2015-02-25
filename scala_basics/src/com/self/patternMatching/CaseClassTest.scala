package com.self.patternMatching

//case classes automatically have equality and nice toString methods based on the constructor arguments.
object CaseClassTest extends App{

 val hp20b = Calculator("hp", "20b")
 val hp20B = Calculator("hp", "20b")
  
 //This will return false. as string and hp20b got concatenated and then compared with hp20B
 //println("Is Case Class object equal "+hp20b == hp20B)
 
  println("hp20b content "+hp20b.toString)
  
  println(hp20b == hp20B)
  
  
}