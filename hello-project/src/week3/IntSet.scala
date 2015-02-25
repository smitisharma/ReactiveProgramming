package week3

import week3.NonEmpty
import week3.IntSet

abstract class IntSet {
	//include element x to set 
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
	//def union(other: IntSet): IntSet
}

class Empty extends IntSet {
	def contains(x: Int): Boolean =  false
	def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
	def contains(x: Int): Boolean = {
	  println("NonEmpty contains");
			if (x < elem) left contains x
			else if (x > elem) right contains x
			else true
	}
	
	def incl(x: Int): IntSet = {
	  println("incl "+x);
			if (x < elem) new NonEmpty(elem, left incl x, right)
			else if (x > elem) new NonEmpty(elem, left, right incl x)
			else this
	}
}

object test{
  def main(args:Array[String]){
  
   var s = new Empty().incl(7);
   println("10 -> "+s.contains(10)+" 7 -> "+s.contains(7));
   
    s = s.incl(8);
    println("8 => "+s.contains(8));
    
  }
  
 
  /*new Empty().*/
}