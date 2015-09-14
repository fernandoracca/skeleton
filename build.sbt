name := "skeleton"

organization := "com.github.fractal"

version := "1.2"

scalaVersion := "2.11.7"

//Define dependencies. These ones are only required for Test and Integration Test scopes.
libraryDependencies ++= Seq(
    "org.scalatest"   %% "scalatest"    % "2.2.4"   % "test,it",
    "org.scalacheck"  %% "scalacheck"   % "1.12.5"      % "test,it"
)

// For Settings/Task reference, see http://www.scala-sbt.org/release/sxr/sbt/Keys.scala.html

// Compiler settings. Use scalac -X for other options and their description.
// See Here for more info http://www.scala-lang.org/files/archive/nightly/docs/manual/html/scalac.html 
scalacOptions ++= List("-feature","-deprecation", "-unchecked", "-Xlint")

// ScalaTest settings.
// Ignore tests tagged as @Slow (they should be picked only by integration test)
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-l", "org.scalatest.tags.Slow", "-u","target/junit-xml-reports", "-oD", "-eS")

//Style Check section
scalastyleConfig <<= baseDirectory { _ / "src/main/config" / "scalastyle-config.xml" }

// Generate Eclipse project with sources for dependencies
EclipseKeys.withSource := true

coverageEnabled := true