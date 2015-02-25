package com.self.model

/* The value color was bound based on an if/else expression. Scala is highly expression-oriented: 
 * most things are expressions rather than statements.*/
class Calculator(brand :String) {


	val color: String = if (brand == "HP"){
		"blue"
	}else {
		"white"
	}


def add(m:Int, n:Int) :Int = m+n;

def common(str:String) = str+"xx";


}