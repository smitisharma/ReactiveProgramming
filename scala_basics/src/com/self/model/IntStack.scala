package com.self.model

abstract class IntStack {
	def isEmpty : Boolean

	//put an item in existing stack , this returns IntStack (IntNonEmptyStack or IntEmptyStack)
	//when you push an element it is creating new non empty stack 
	def push(item:Int) : IntStack = new IntNonEmptyStack(item, this)

	//top element 
	def head : Int
	
	//rest of the stack 
	def tail : IntStack


}