package rm.catscalatest

import cats.instances.{AnyValInstances, StringInstances}
import cats.syntax.{EitherSyntax, OptionSyntax}
import org.scalatest.FreeSpec

trait MySpec extends FreeSpec with StrictCatsEquality with OptionSyntax with EitherSyntax //
 with AnyValInstances with StringInstances

