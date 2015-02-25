package com.self

object testAbstractWithParam extends App{
  
  var obj = new com.self.model.AbstractWithParamImpl(3);
  println(obj.abstractMethod());

}