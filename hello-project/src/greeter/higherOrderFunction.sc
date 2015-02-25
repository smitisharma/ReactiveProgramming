package greeter
import math.abs

object higherOrderFunction {

  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)     //> sum: (f: Int => Int)(a: Int, b: Int)Int

  //sum all numbers from a to b and apply function f on number

  sum(x => x)(1, 3)                               //> res0: Int = 6
  sum(x => x * x * x)(1, 3)                       //> res1: Int = 36

  def summation(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  }                                               //> summation: (f: Int => Int)(a: Int, b: Int)Int

  summation(x => x)(1, 3)                         //> res2: Int = 6
  // loop(1,0)
  //	loop(2, 0+1)
  // loop(3, 1+f(2)
  //loop(4, 1+2+3)


  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance              //> isCloseEnough: (x: Double, y: Double)Boolean

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(guess +" "+next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double

	fixedPoint(x => 1+x/2)(1);                //> 1.0 1.5
                                                  //| 1.5 1.75
                                                  //| 1.75 1.875
                                                  //| 1.875 1.9375
                                                  //| 1.9375 1.96875
                                                  //| 1.96875 1.984375
                                                  //| 1.984375 1.9921875
                                                  //| 1.9921875 1.99609375
                                                  //| 1.99609375 1.998046875
                                                  //| 1.998046875 1.9990234375
                                                  //| 1.9990234375 1.99951171875
                                                  //| 1.99951171875 1.999755859375
                                                  //| res3: Double = 1.999755859375
	//def sqrt(x:Double) =
		//fixedPoint(y => x/y)(1.0)
		
  def averageDamp(f: Double => Double)(x: Double) =
   (x + f(x)) / 2                                 //> averageDamp: (f: Double => Double)(x: Double)Double
  
  def sqrt(x:Double)  =
  	fixedPoint(averageDamp(y => x/y))(1)      //> sqrt: (x: Double)Double
		
		sqrt(4)                           //> 1.0 2.5
                                                  //| 2.5 2.05
                                                  //| 2.05 2.000609756097561
                                                  //| 2.000609756097561 2.0000000929222947
                                                  //| 2.0000000929222947 2.000000000000002
                                                  //| res4: Double = 2.000000000000002
                                             
	
}