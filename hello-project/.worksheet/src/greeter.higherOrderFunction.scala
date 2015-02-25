package greeter
import math.abs

object higherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(156); 

  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(85); val res$0 = 

  //sum all numbers from a to b and apply function f on number

  sum(x => x)(1, 3);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  sum(x => x * x * x)(1, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(178); 

  def summation(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  };System.out.println("""summation: (f: Int => Int)(a: Int, b: Int)Int""");$skip(27); val res$2 = 

  summation(x => x)(1, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(99); 
  // loop(1,0)
  //	loop(2, 0+1)
  // loop(3, 1+f(2)
  //loop(4, 1+2+3)


  val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(81); 
  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(265); 

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(guess +" "+next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(29); val res$3 = 

	fixedPoint(x => 1+x/2)(1);System.out.println("""res3: Double = """ + $show(res$3));$skip(127); ;
	//def sqrt(x:Double) =
		//fixedPoint(y => x/y)(1.0)
		
  def averageDamp(f: Double => Double)(x: Double) =
   (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(67); 
  
  def sqrt(x:Double)  =
  	fixedPoint(averageDamp(y => x/y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$4 = 
		
		sqrt(4);System.out.println("""res4: Double = """ + $show(res$4))}
                                             
	
}
