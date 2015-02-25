package com.self.Exceptions

object Exception1 extends App{

	var obj = new remoteCalculatorService()

	var result = try{

		obj.add(3, 4)

	}catch{

		case e: Exception => {

			println(e, "the remote calculator service is unavailable.")
			0;
			}

	} finally {
		obj.close()
	}
	
	println("Result "+result)
}