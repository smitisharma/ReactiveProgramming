package week4

/*Wirte a function nth that takes an integer n and a list and selects the n’th element of the list.

Elements are numbered from 0.

If index is outside the range from 0 up the length of the list minus one, a IndexOutOfBoundsException should be thrown.*/
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]

}

//head and tail of class parameters works as method definition in trait List[T]
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false;

}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true;
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}

object a{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(898); 

def nth[T](elem : Int , elemList : List[T]) : T =
	if(elemList.isEmpty)
		throw new IndexOutOfBoundsException
	else if(elem == 0)
		elemList.head
	else nth(elem - 1, elemList.tail);System.out.println("""nth: [T](elem: Int, elemList: week4.List[T])T""");$skip(64); 
	
	val list = new Cons(11, new Cons(22, new Cons(33, new Nil)));System.out.println("""list  : week4.Cons[Int] = """ + $show(list ));$skip(13); val res$0 = 
nth(2, list);System.out.println("""res0: Int = """ + $show(res$0))}

/*
nth(3,new Cons(11, new Cons(22, new Cons(33, new Nil))))
 nth(2,new Cons(22,new Cons(33,new Nil))
	nth(1, new Cons(33,new Nil)
         nth (0, new Nil)

   Since list is Nil or IndexOutOfBoundsException
*/
}
