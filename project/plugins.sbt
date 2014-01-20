resolvers ++= Seq(
        Classpaths.typesafeResolver
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.4")
 
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")
