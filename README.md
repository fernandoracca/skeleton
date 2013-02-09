Skeleton
------------

This project aims to simplify creating a project from scratch.It's simpler than g8 because it doesn't require any additional tools, just clone, build and run.
It provides:

     Scala 2.10.0
     SBT 0.12.2
     ScalaTest 2.0M5b2
     IntelliJ IDEA
     Scala-IDE 2.0+
     [SBT-man](https://github.com/sbt/sbt-man) - Extremely handy Scaladoc info from your shell! 

Use
---------------
Clone and update the project name from build.sbt

    git clone git://github.com/fractal/sst my-project
    cd my-project
    vi build-sbt # change name to my-project
    sbt
    test
    gen-idea
    eclipse

Requires
---------------
* [sbt 0.12.2](https://scala-sbt.org]

Recommends
---------------
* Latest IDEA 12+ and Scala and SBT plugin.
* Latest [Scala IDE 2.1 M3+](http://scala-ide.org/download/milestone.html). Works great out of the box. 
* Read [sbt eclipse](https://github.com/typesafehub/sbteclipse/wiki/Using-sbteclipse) for more details.
* Scala Tests require ScalaTest 2.0 plugin plugin in Eclipse. Make sure you install when downloading the scala plugin as optional. 
