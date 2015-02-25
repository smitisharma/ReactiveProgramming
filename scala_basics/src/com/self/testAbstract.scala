package com.self

object testAbstract extends App{

  //error: class abstractShape is abstract; cannot be instantiated
  //val abstractShapeObject = new com.self.model.abstractShape;
  
  val area = new com.self.model.Circle(2);
  println("Area of circle with radius = 2 is "+area.getArea());
}