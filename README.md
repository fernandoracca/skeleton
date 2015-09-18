Skeleton
------------

This project aims to simplify creating a project from scratch, ready to use in your IDE.
It's arguably simpler than typesafe activator or g8 because it doesn't require any additional tools, just clone, build and run.
It provides a simple way to have a project running with the following tools configured:

     Scala 2.11.7
     SBT 0.13.9
     ScalaTest 2.2.4
     ScalaCheck 1.12.5
     IntelliJ IDEA 
     Scala-IDE 3.0+
     Jenkins (test Reporting and code coverage)
     ScalaStyle

Requires
---------------
* Please download latest version of SBT.
* [sbt 0.13.9](http://www.scala-sbt.org)

Use
---------------
Clone and update the project name from build.sbt

    $ git clone git://github.com/fractal/skeleton my-project
    $ cd my-project
    $ rm -rf .git
    $ vi build.sbt # change name to my-project, and organization to something that suits you
    $ sbt
    > test

IDE
---------------
* Intellij IDEA (13 | 14). Intellij has great support for Scala, and works fast on this setup.
	> gen-idea

	* [Intellij IDEA 14](http://www.jetbrains.com/idea/download/). Community edition with Scala plugin is enough.

* Scala IDE: Uses Eclipse. Lagging behind Intellij in features, but offers the familiar feel of Eclipse development. 	
	> eclipse
	
	* Read [sbt eclipse](https://github.com/typesafehub/sbteclipse/wiki/Using-sbteclipse) for more details.
	* [Scala IDE 3](http://scala-ide.org). Install at least the ScalaTest plugin, Play plugin if you are building a web app using it.

Test
------------------
The best feature of SBT is incremental compilation. This is most evident when testing.

	> ~ test

Be warned, it's addictive. You'll never want to code in any other statically compiled language without this feature.

Test a single TestSuite

	> test-only package.subpackage.Class

Test and Jenkins
-------------------

ScalaTest is been configured to produce test reports in the JUnit XML format that Jenkins can understand in target/junit-xml-reports.
Configure Jenkins to use this folder. For many more options to configure, use the [ScalaTest runner documentation](http://www.scalatest.org/user_guide/using_the_runner)

Integration Test
-------------------
Abbreviated as it. A bit fiddly, since it will require every setting defined for test to also be defined for it.

	> it:test

Useful commands
-----------------
The former will run a scala REPL with all the project dependencies available. The later will autoscan and run a Main class.
	> console
	> run

Code Coverage
------------------
Uses Scoverage as a code coverage tool. The main advantage over other coverage tools is that it understands expressions, as opposed to lines.

	> test
	> coverageReport

See [Scoverage Plugin](https://github.com/scoverage/sbt-scoverage)

Read documentation details, specially if using integration tests.

Style Checker
-------------------
Uses [ScalaStyle](http://www.scalastyle.org)

	> scalastyle

SBT Launch useful configuration options
---------------------------------------
Some of these configuration options are quite important to know when setting up a project behind a company proxy.
Configure then in your ~/.sbt/conf/sbtconfig.txt or sbtopts

	# Reserver a decent amount of memory for the SBT JVM  
 
	-Xms256M
 
	-Xmx2048M
 
	-XX:ReservedCodeCacheSize=128m
 
	# Set additional SBT options and HTTP Proxies if needed
 
	# -Dsbt.ivy.home=<m2 repo>
 
	-Dsbt.log.format=true
 
	# -Dhttp.proxyHost=<your_proxy_host>
 
	# -Dhttp.proxyPort=<your_proxy_port>
 
	# -Dhttp.nonProxyHosts="<dont_use_proxy_for_these_addresses>"


Final Remarks
--------------------
These settings are for convenience when setting up a project from scratch, and you want to get up and running quickly. 
There are probably better ways in the long run, since much of this configuration can be defined in your sbt home, and shared by any project.
However, in this way, any developer who fetches the project will have the same settings as you.

Author
--------------------
Fernando Racca

[@quant_leap](http://twitter.com/quant_leap)

[fractal/skeleton](http://github.com/fractal/skeleton)
