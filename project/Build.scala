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
      	.settings( scalaSource in IntegrationTest <<= baseDirectory / "src/test/scala" )
      	.settings( resourceDirectory in IntegrationTest <<= baseDirectory / "src/test/resources" )
      	.settings( parallelExecution in IntegrationTest := false) 
      	.settings( testOptions in IntegrationTest += Tests.Argument(TestFrameworks.ScalaTest, "-n", "org.scalatest.tags.Slow"))
      	
}
