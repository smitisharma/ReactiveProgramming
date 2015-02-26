package com.self.collections

object MapOperators1 extends App{

  val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
  
  //First WAY
  // filter out every entry whose phone extension is lower than 200. In tuple first is name and second is phone ext
  val filteredMap = extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)
  
  println(filteredMap)
  
  //Alternate WAY
  var filteredMap1 = extensions.filter({case (name, extension) => extension < 200})
  
  println(filteredMap1)
}