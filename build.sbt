name := "skeleton"

organization := "uk.co.fluidlabs"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
)

EclipseKeys.withSource := true
