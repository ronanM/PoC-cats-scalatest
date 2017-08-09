package rm.catscalatest

import cats.kernel.Eq
import cats.kernel.Eq.fromUniversalEquals

case class MyData(name: String, age: Option[Int]) {}

object MyData {

  implicit val myDataEq: Eq[MyData] = fromUniversalEquals
}
