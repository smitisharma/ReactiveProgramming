package com.self.apply

/*On creating FooMaker object,
 * 1. FooMaker object created 
 * 2. Foo class object will be returned*/
object FooMaker {
  
  def apply() = new Foo
  
}