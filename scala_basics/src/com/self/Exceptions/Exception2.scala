package com.self.Exceptions
import java.lang.Exception

object Exception2 extends App{

	var obj = new remoteCalculatorService()

	try{
		var sum = obj.add(3, 4)
		println(sum)
	}catch{
	  
	//case e: ServerIsDownException => log.error(e, "the remote calculator service is unavailable. should have kept your trusty HP.")
	
	case e: Exception => println(e, "the remote calculator service is unavailable.")
	
	} finally {
		obj.close()
	}
}