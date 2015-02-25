package com.self.model
//push element x to existing stack s 
class IntNonEmptyStack(elem:Int , restStack : IntStack ) extends IntStack {

	def isEmpty = false 
	def tail = restStack
	def head = elem
	
}