package com.self
import com.self.selfTrait.Car;
import com.self.selfTrait.Shiny

//Class BMW needs to be abstract since value shineRefraction defined in Shiny is not defined
//One class can extend several traits using the with keyword:
class traitDemo extends Car with Shiny{
  val brand = "BMW"
  val shineRefraction = 1;
}