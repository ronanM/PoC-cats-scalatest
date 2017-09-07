package rm.catscalatest

class MyDataTest extends MySpec {

  implicit val myDataEq = cats.derive.eq[MyData]

  "MyData Eq" in {
    val either1: Either[String, (String, Int)] = ("a", 42).asRight[String]
    assert(either1 === ("a", 42).asRight)

    val either2: Either[String, Int] = 42.asRight[String]
    assert(either2 === 42.asRight)

    assert(MyData("toto", 10.some) === MyData("toto", 10.some))
    //assert(MyData("toto", 10.some) === MyData("toto", 101.some))
  }
}
