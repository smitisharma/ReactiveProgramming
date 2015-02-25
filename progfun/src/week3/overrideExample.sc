package week3

object overrideExample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val t = new sub().foo                           //> t  : Int = 2

}

abstract class Base1 {
	def foo =  1
}

class sub extends Base1{
 override def foo = 2
}