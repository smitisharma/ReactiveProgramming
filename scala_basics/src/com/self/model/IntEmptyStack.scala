package com.self.model

class IntEmptyStack extends IntStack{
  
  def isEmpty =true
  
  //to throw customized Runtime exception as EmptyStack.head
  def head = error("EmptyStack.head")
  def tail = error("EmptyStack.tail")

}