organization := "com.github.fractal"
name := "skeleton"
version := "1.9"

scalaVersion := "2.13.16"
// For Settings/Task reference, see http://www.scala-sbt.org/release/sxr/sbt/Keys.scala.html

lazy val scalaTestVersion = "3.2.19"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest-freespec" % scalaTestVersion % "test",
  "org.scalatest" %% "scalatest-mustmatchers" % scalaTestVersion % "test",
  "org.scalacheck" %% "scalacheck" % "1.15.3" % "test"
)

Test / testOptions += Tests.Argument(
  TestFrameworks.ScalaCheck, "-maxSize", "5", "-minSuccessfulTests", "33",
  "-workers", s"${java.lang.Runtime.getRuntime.availableProcessors - 1}" ,
  "-verbosity", "1"
)

watchTriggeredMessage := Watch.clearScreenOnTrigger
