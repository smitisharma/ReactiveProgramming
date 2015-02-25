package greeter

object helloWorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(79); 
  
  def sumInts(a: Int, b:Int): Int =
  	if(a>b) 0
  	else a + sumInts(a+1,b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(20); val res$1 = 
  	
  	sumInts(1,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(83); 
  	
  def sumCube(a:Int, b:Int): Int =
  	if(a>b) 0
  	else cube(a)+sumCube(a+1,b);System.out.println("""sumCube: (a: Int, b: Int)Int""");$skip(34); 
  	
  def cube(a:Int):Int = a*a*a;System.out.println("""cube: (a: Int)Int""");$skip(18); val res$2 = 
  
  sumCube(1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(87); 
  
  	
  def product(a:Int , b:Int) : Int =
  	if(a > b) 1
  	else a * product(a+1, b);System.out.println("""product: (a: Int, b: Int)Int""");$skip(20); val res$3 = 
  
   product(1, 4);System.out.println("""res3: Int = """ + $show(res$3));$skip(90); 
   
   def sum(f: Int =>Int, a:Int ,b:Int):Int =
   if(a>b) 0
   else f(a) + sum(f,a+1,b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(55); 
   
  def sumIntegers(a:Int ,b:Int) = sum( x =>x ,a,b);System.out.println("""sumIntegers: (a: Int, b: Int)Int""");$skip(57); 
  
  def sumCubes(a: Int, b:Int) = sum(x => x*x*x , a,b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(20); val res$4 = 
  sumIntegers(1, 3);System.out.println("""res4: Int = """ + $show(res$4));$skip(15); val res$5 = 
	sumCubes(1,3);System.out.println("""res5: Int = """ + $show(res$5));$skip(70); 
	
	def factorial(a: Int):Int =
		if(a==1) 1
		else a * factorial(a-1);System.out.println("""factorial: (a: Int)Int""");$skip(18); val res$6 = 
  
  factorial(4);System.out.println("""res6: Int = """ + $show(res$6))}
   

}
