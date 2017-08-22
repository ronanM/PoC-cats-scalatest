scalaVersion := "2.12.3"

val catsV      = "1.0.0-MF"
val scalatestV = "3.0.4"
val kittensV   = "1.0.0-M11"

libraryDependencies += "org.typelevel" %% "cats-core"    % catsV
libraryDependencies += "org.typelevel" %% "cats-testkit" % catsV % Test

//libraryDependencies += "org.scalactic" %% "scalactic" % scalatestV
libraryDependencies += "org.scalatest" %% "scalatest" % scalatestV % "test"

libraryDependencies += "org.typelevel" %% "kittens" % kittensV
