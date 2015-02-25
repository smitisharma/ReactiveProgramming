package com.self.selfTrait

/*    If you need a constructor parameter, use an abstract class. Abstract class constructors can take parameters; 
 *    trait constructors can’t. For example, you can’t say trait t(i: Int) {}; the i parameter is illegal.

 * */
trait Car {
   val brand: String

}