package com.self.patternMatching

/*COMPARIG EACH OBJECT BASED ON INSTANCE VARIABLE VALUES*/

//import com.self.model.Calculator

    //If class is com.self.model.Calculator
 // case _ if calc.brand == "hp" && calc.color == "30B" => "business"  //Error because brand is mentioned in constructor not 
    //as class member variable 

object MatchingOnClassMembers extends App {
  
  def calcType(calc: CalculatorOne) = calc match {
  case _ if calc.brand == "HP" && calc.color == "blue" => "financial"
  case _ if calc.brand == "HP" && calc.color == "white" => "scientific"
  case _ => "unknown"
}
    
  val calType = calcType(new CalculatorOne())
  println(calType)
  
  


}