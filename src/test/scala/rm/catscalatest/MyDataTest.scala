package rm.catscalatest

class MyDataTest extends MySpec {

  "MyData Eq" in {
    assert(("a", 42).asRight[String] === ("a", 42).asRight[String])
    assert(42.asRight[String] === 42.asRight[String])

    assert(MyData("toto", 10.some) === MyData("toto", 101.some))
  }
}
