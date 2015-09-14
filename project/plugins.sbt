resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  Resolver.url("sbt-scoverage repo", url("https://dl.bintray.com/sksamuel/sbt-plugins"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.1")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")
