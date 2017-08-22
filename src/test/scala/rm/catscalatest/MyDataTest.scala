package rm.catscalatest

import cats.Eq
import cats.implicits._
import cats.derived._
import cats.derived.eq._

class MyDataTest extends MySpec {

  "MyData Eq" in {
    val either1: Either[String, (String, Int)] = ("a", 42).asRight[String]
    assert(either1 === ("a", 42).asRight)

    val either2: Either[String, Int] = 42.asRight[String]
    assert(either2 === 42.asRight)

    implicitly[Eq[MyData]]

    assert(MyData("toto", 10.some) === MyData("toto", 10.some))
    //assert(MyData("toto", 10.some) === MyData("toto", 101.some))
  }
}
