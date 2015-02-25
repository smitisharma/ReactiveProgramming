package com.self.collections.FunctionalCombinators

object GeneralizedFunctionalCombinators extends App{

	var numbers = List(1,2,3)
	
	def timesTwo(i:Int) = i*2
	
	def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = 
	{
			numbers.foldRight(List[Int]()) { 
			  
			  (x: Int, xs: List[Int]) => fn(x) :: xs
			}
	}

	var newList = ourMap(numbers, timesTwo(_))
	println(newList)
}