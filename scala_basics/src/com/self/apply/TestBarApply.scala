package com.self.apply

object TestBarApply extends App{

	val bar = new Bar

	println(bar) //Bar object will be returned
	
	//Here our instance object looks like we’re calling a method.
	println(bar())//this will get value from Bar.apply() method


}