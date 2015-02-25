Fpackage greeter

object higherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 

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

  summation(x => x)(1, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(98); 
  // loop(1,0)
  //	loop(2, 0+1)
  // loop(3, 1+f(2)
  //loop(4, 1+2+3)

  val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(86); 
  def isCloseEnough(x: Double, y: Double) =
    Math.abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(254); 

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""")}

}
