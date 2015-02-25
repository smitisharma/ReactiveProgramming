package greeter


object RationalMain extends App {

	
		
		val x = new Rational(1, 3)
		val y = new Rational(5, 7)
		val z = new Rational(3, 2)
		val n = x.add(y).mul(z)
		println(n.numer+"  "+n.denom);
		

}