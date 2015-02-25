package week3

object override {
  println("Welcome to the Scala worksheet")
}

abstract class Base { class Sub extends Base {
def foo = 1 override def foo = 2
def bar: Int def bar = 3
}
