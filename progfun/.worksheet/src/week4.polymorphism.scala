package week4


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

def nth[T](elem : T) = new Cons[T](elem, new Nil[T]);

object polymorphism {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(574); 
  println("Welcome to the Scala worksheet");$skip(61); 
	def singleton[T](elem : T) = new Cons[T](elem, new Nil[T]);;System.out.println("""singleton: [T](elem: T)week4.Cons[T]""")}
                                                  
  //singleton(1).isEmpty
 
 //singleton[Int](1);

}
//class expPolymorphism{

//}
