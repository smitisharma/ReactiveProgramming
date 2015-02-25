package week2

object exercise {
	//tail recursive way of recursion
  def factorial(n:Int): Int = {
  
  def loop(acc: Int , n:Int): Int = {
  	if (n==0) acc
  	else loop(acc*n, n-1)
  }
  	loop(1,n) //inital value of accumulator  , n is actual value
  }                                               //> factorial: (n: Int)Int
  
  factorial(3)                                    //> res0: Int = 6
  factorial(4)                                    //> res1: Int = 24
  
  def factorialRecursive(n:Int): Int = {
  	if(n==0) 1 else n * factorialRecursive(n-1)
  }                                               //> factorialRecursive: (n: Int)Int
	
	factorialRecursive(3)                     //> res2: Int = 6

	
}