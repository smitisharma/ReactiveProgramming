package greeter

object helloWorkSheet {
  val x = 1                                       //> x  : Int = 1
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 2
  
  def sumInts(a: Int, b:Int): Int =
  	if(a>b) 0
  	else a + sumInts(a+1,b)                   //> sumInts: (a: Int, b: Int)Int
  	
  	sumInts(1,3)                              //> res1: Int = 6
  	
  def sumCube(a:Int, b:Int): Int =
  	if(a>b) 0
  	else cube(a)+sumCube(a+1,b)               //> sumCube: (a: Int, b: Int)Int
  	
  def cube(a:Int):Int = a*a*a                     //> cube: (a: Int)Int
  
  sumCube(1,3)                                    //> res2: Int = 36
  
  	
  def product(a:Int , b:Int) : Int =
  	if(a > b) 1
  	else a * product(a+1, b)                  //> product: (a: Int, b: Int)Int
  
   product(1, 4)                                  //> res3: Int = 24
   
   def sum(f: Int =>Int, a:Int ,b:Int):Int =
   if(a>b) 0
   else f(a) + sum(f,a+1,b)                       //> sum: (f: Int => Int, a: Int, b: Int)Int
   
  def sumIntegers(a:Int ,b:Int) = sum( x =>x ,a,b)//> sumIntegers: (a: Int, b: Int)Int
  
  def sumCubes(a: Int, b:Int) = sum(x => x*x*x , a,b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  sumIntegers(1, 3)                               //> res4: Int = 6
	sumCubes(1,3)                             //> res5: Int = 36
	
	def factorial(a: Int):Int =
		if(a==1) 1
		else a * factorial(a-1)           //> factorial: (a: Int)Int
  
  factorial(4)                                    //> res6: Int = 24
   

}