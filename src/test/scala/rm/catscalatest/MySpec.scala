package rm.catscalatest

import cats.Eq
import cats.instances.AllInstances
import cats.syntax.{AllSyntax, EqOps}
import cats.tests.StrictCatsEquality
import org.scalatest.FreeSpec

trait MySpec extends FreeSpec with StrictCatsEquality with AllInstances with AllSyntax {
  // disable Eq syntax (by making `catsSyntaxEq` not implicit), since it collides
  // with scalactic's equality
  override def catsSyntaxEq[A: Eq](a: A): EqOps[A] =
    new EqOps[A](a)

}
