package com.self.objectDemo

//Here is a trivial example that only serves to remove the need to use ‘new’ to create an instance.

class Bar(foo: String)

object Bar {
	def apply(foo: String) = new Bar(foo)
	
	
}
