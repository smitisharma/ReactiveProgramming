package com.self.model

class AbstractWithParamImpl(param:Int) extends AbstractWithParameter(param){

	def abstractMethod():Int = {
			println("in abstract impl"); 
			param*param;
	}

}