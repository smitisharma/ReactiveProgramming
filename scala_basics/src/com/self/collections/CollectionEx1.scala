package com.self.collections

/*-> can be use to create Tuples.   1 -> 2 generates (1,2)
 * Map()  internal : Map(1 -> "one", 2 -> "two") 
 * which expands into Map((1, "one"), (2, "two")) with the first element being the key and the second being the value of the Map.
 * 
 * */
object CollectionEx1 extends App{

	val list = List(11,11,12)
			println(list +" contains 1  "+ list.contains(11) +"  ==>> "+list(2))

			val set = Set(11,11,12,14)
			println(set+"  contains(13) = "+set.contains(13)+" HEAD "+set.head+" TAIL "+set.tail+" ISEMPTY "+set.isEmpty) //ACCESS SET ELEMENTS ?


			val hostPort = ("localhost", 80)
			println(hostPort._1+"  "+hostPort._2)



			var port = hostPort match {
			case ("localhost", port) => 80
			case ("mysity.com", port) => 10
			}

	println("port "+port)

	//MAPS
	var map1 = Map(1 -> 2)
	var map2 = Map("foo" -> "bar")

	println(map1.get(1))


}