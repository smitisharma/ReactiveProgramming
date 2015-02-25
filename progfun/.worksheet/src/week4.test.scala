package week4

object test{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); 
	def main(){
	};System.out.println("""main: ()Unit""")}
}

object polymorphism {
  println("Welcome to the Scala worksheet")
	def singleton[T](elem : T) = new Cons[T](elem, new Nil[T]);
	object testPoly{
		println("isEmpty : "+singleton(1).isEmpty);
	}
 //singleton[Int](1);
}
//class expPolymorphism{

//}

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
  