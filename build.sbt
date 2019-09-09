organization := "com.github.fractal"
name := "skeleton"
version := "1.5"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.scalatest"   %% "scalatest" % "3.0.8"   % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
)

// For Settings/Task reference, see http://www.scala-sbt.org/release/sxr/sbt/Keys.scala.html
// Compiler settings. Use scalac -X for other options and their description.
scalacOptions ++= List(
  "-encoding",
  "utf8",
  "-explaintypes",
  "-feature",
  "-deprecation",
  "-unchecked",
  "-Xlint",
  "-Yrangepos",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused"
)
