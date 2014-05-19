import sbt._
import Keys._

/**
 * Additional configuration
 */ 
object Build extends Build {
 
  lazy val integrationTest =
    Project("root", file("."))
      .configs( IntegrationTest )
        .settings( Defaults.itSettings : _* )
      	.settings(
          scalaSource in IntegrationTest <<= baseDirectory / "src/test/scala",
      	  resourceDirectory in IntegrationTest <<= baseDirectory / "src/test/resources",
      	  parallelExecution in IntegrationTest := false,
          testOptions in IntegrationTest += Tests.Argument(TestFrameworks.ScalaTest, "-n", "org.scalatest.tags.Slow"))
      	
}
