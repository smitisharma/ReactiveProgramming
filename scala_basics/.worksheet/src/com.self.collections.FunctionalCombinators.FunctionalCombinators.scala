package com.self.collections.FunctionalCombinators

object FunctionalCombinators {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(126); 
  println("Welcome to the Scala worksheet");$skip(46); 
  
 	var numbers = List(1,3,4,5,2,6,7,8,9,10);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(123); val res$0 = 
 	
  //find returns the first element of a collection that matches a predicate function.
  numbers.find((i: Int) => i > 5);System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(111); val res$1 = 
  
  //drop drops the first i elements. Returns new list but actual
  //list will remain same
	numbers.drop(5);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(231); val res$2 = 
	
	/*dropWhile removes the first elements that match a predicate function. For example,
	if we dropWhile odd numbers from our list of numbers, 1,3 gets dropped (but not 5 which is “shielded” by 4).*/
	numbers.dropWhile(_ % 2 != 0);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(211); val res$3 = 
	
	//foldLeft addes all the elements of list from left and store the result in accumulator.
	//initial value accumulator = 0
	numbers.foldLeft(0)((accumulator: Int, listItem: Int) => { accumulator + listItem} );System.out.println("""res3: Int = """ + $show(res$3));$skip(127); val res$4 = 
	
	numbers.foldLeft(0)((accumulator: Int, listItem: Int) => { println(accumulator +" + "+ listItem);	accumulator + listItem} );System.out.println("""res4: Int = """ + $show(res$4));$skip(235); val res$5 = 
           
  	//foldRight addes all the elements of list from right and store the result in accumulator.
  numbers.foldRight(0) { (listItem: Int, accumulator: Int) => println( listItem + " + " + accumulator); listItem + accumulator };System.out.println("""res5: Int = """ + $show(res$5));$skip(100); val res$6 = 
   
   //flatten collapses one level of nested structure.
   List(List(1, 2), List("a", 4)).flatten;System.out.println("""res6: List[Any] = """ + $show(res$6));$skip(78); 
   
   
   //FLATMAP demo
   val nestedMembers = List( List(1,2) , List(3,4));System.out.println("""nestedMembers  : List[List[Int]] = """ + $show(nestedMembers ));$skip(152); 
    
    //FIRST WAY
   //step1 : apply map function on inner and outer list
   var mappedMembers = nestedMembers.map( (x : List[Int]) => x.map(_ * 2));System.out.println("""mappedMembers  : List[List[Int]] = """ + $show(mappedMembers ));$skip(58); val res$7 = 
   
 //step2 : flatten the list
    mappedMembers.flatten;System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(58); val res$8 = 

	//SECOND WAY
	 nestedMembers.flatMap(x => x.map(_ * 2));System.out.println("""res8: List[Int] = """ + $show(res$8))}
}
