package com.self

object CalculatorObj extends App{

  val calc = new com.self.model.Calculator("HP");
  val sum = calc.add(2, 3);
  println("sum "+sum);
  println("brand "+calc.color);
  
  
  val scCalc = new com.self.model.ScientificCalculator("HP");
  println(scCalc.log(2, 3));
  println("--> "+scCalc.common("ab",1));
  
 
  
  
}