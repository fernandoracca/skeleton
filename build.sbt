name := "skeleton"

organization := "uk.co.fluidlabs"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"
)

EclipseKeys.withSource := true
