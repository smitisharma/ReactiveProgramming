package week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(254); 
	//tail recursive way of recursion
  def factorial(n:Int): Int = {
  
  def loop(acc: Int , n:Int): Int = {
  	if (n==0) acc
  	else loop(acc*n, n-1)
  }
  	loop(1,n) //inital value of accumulator  , n is actual value
  };System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$0 = 
  
  factorial(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(95); 
  
  def factorialRecursive(n:Int): Int = {
  	if(n==0) 1 else n * factorialRecursive(n-1)
  };System.out.println("""factorialRecursive: (n: Int)Int""");$skip(25); val res$2 = 
	
	factorialRecursive(3);System.out.println("""res2: Int = """ + $show(res$2))}

	
}
