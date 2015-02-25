package com.self.model

/*Inheritance and overloading */
class ScientificCalculator(brand:String) extends Calculator(brand){
  
  def log(m: Double, base: Double) = math.log(m) / math.log(base)

  def common(str:String, i:Int) = {
    println("in scientific ");
    str+"__override";}
  
  // def log(m: Int): Double = log(m, math.exp(1))
}