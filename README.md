Skeleton
------------

This project aims to simplify creating a project from scratch.It's simpler than g8 because it doesn't require any additional tools, just clone, build and run.
It provides a simple way to configure:

     Scala 2.10.2
     SBT 0.12.3
     ScalaTest 2.0M5b2
     IntelliJ IDEA
     Scala-IDE 3.0

Use
---------------
Clone and update the project name from build.sbt

    git clone git://github.com/fractal/skeleton my-project
    cd my-project
    rm -rf .git
    vi build-sbt # change name to my-project, and organization to something that suits you
    sbt
    test
    gen-idea
    eclipse

Requires
---------------
* [sbt 0.12.3](https://scala-sbt.org]

Recommends
---------------
* Latest IDEA 12+ and Scala and SBT plugin.
* Latest [Scala IDE 3](http://scala-ide.org/download/). Works great out of the box and offers ScalaTest integration  
* Read [sbt eclipse](https://github.com/typesafehub/sbteclipse/wiki/Using-sbteclipse) for more details.
