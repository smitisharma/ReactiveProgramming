package com.self
import com.self.model.IntEmptyStack,com.self.model.IntNonEmptyStack


object stackTest extends App{
 
  
  val emptyStack = new IntEmptyStack();
  
   println("is stack empty "+emptyStack.isEmpty);
   //println("stack head  "+emptyStack.head);  // Will throw exception as "EmptyStack.head"
   //println("stack tail  "+emptyStack.tail);  // Will throw exception as "EmptyStack.tail"
  
  var stack = new com.self.model.IntNonEmptyStack(2,emptyStack);
  println("isEmpty "+stack.isEmpty)
  println("head "+stack.head)
 
  val newStack = stack.push(3)
  println("head now "+newStack.head)
  println("rest "+newStack.tail)
  
  //val stack = new IntNonEmptyStack(1,new IntNonEmptyStack(2, emptyStack))
  //println(stack.isEmpty)
  
  

}