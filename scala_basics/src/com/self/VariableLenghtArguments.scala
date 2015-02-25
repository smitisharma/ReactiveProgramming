package com.self

object VariableLenghtArguments extends App{

	def capitalizeAll(args: String*) = {
		args.map { arg =>
		println("New str "+arg.capitalize);
		}
	}

	capitalizeAll("a","b","abc");

}