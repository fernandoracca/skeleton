organization := "com.github.fractal"
name := "skeleton"
version := "1.4"

scalaVersion := "2.12.8"
// Compiler settings. Use scalac -X for other options and their description.
// See Here for more info http://www.scala-lang.org/files/archive/nightly/docs/manual/html/scalac.html
scalacOptions ++= List("-feature","-deprecation", "-unchecked", "-Xlint")


libraryDependencies ++= Seq(
  "org.scalatest"   %% "scalatest"    % "3.0.5"   % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
)

// For Settings/Task reference, see http://www.scala-sbt.org/release/sxr/sbt/Keys.scala.html
