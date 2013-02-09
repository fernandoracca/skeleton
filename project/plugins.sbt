resolvers ++= Seq(
        Classpaths.typesafeResolver,
	"Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
        Resolver.url("sbt-plugin-releases", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.1")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.3.0-SNAPSHOT")

addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")
