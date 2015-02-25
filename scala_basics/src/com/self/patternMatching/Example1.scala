package com.self.patternMatching

object Example1 extends App{

	val times = 1

	val txt = times match{
				case 1 => "one"
				case 2 => "two"
				case _ => "random"
			}

	println("pattern matching "+times+" txt "+txt)

}