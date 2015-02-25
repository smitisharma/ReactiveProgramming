package com.self.Exceptions

class remoteCalculatorService {

  def add(m:Int , n:Int) = {
    m +n
    throw new RuntimeException()
  }
		 
  def close() = println("Graceful closing the object ")
}