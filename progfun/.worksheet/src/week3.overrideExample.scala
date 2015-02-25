package week3

object overrideExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  println("Welcome to the Scala worksheet");$skip(24); 
  val t = new sub().foo;System.out.println("""t  : Int = """ + $show(t ))}

}

abstract class Base1 {
	def foo =  1
}

class sub extends Base1{
 override def foo = 2
}
