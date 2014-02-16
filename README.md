Skeleton
------------

This project aims to simplify creating a project from scratch.It's simpler than g8 or typesafe activator because it doesn't require any additional tools, just clone, build and run.
It provides a simple way to configure:

     Scala 2.10.3
     SBT 0.13.1
     ScalaTest 2.0
     ScalaCheck 1.11.2
     IntelliJ IDEA 
     Scala-IDE 3.0+

Requires
---------------
* Please download latest version of SBT.
* [sbt 0.13.1](https://scala-sbt.org)

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
* Install your favourite IDE and plugins.
	* [Intellij IDEA 13](http://jetbrains.com/download) with Scala and SBT plugins.
	* [Scala IDE 3](http://scala-ide.org/download/). Install at least the ScalaTest plugin.
* Read [sbt eclipse](https://github.com/typesafehub/sbteclipse/wiki/Using-sbteclipse) for more details.

IDE project Setup
-----------------
	> gen-idea
 	> eclipse

Test
------------------
The best feature of SBT is incremental compilation. This is most evident when testing.

	> ~ test

Be warned, it's addictive. You'll never want to code in any other statically compiled language without this feature.

Test a single TestSuite

	> testOnly package.subpackage.Class

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
Uses Jacoco via [Jacoco4sbt](https://github.com/sbt/jacoco4sbt/wiki)

	> jacoco:check

Read documentation details, specially if using integration tests.

Style Checker
-------------------
Uses ScalaStyle(http://www.scalastlye.org)

	> scalastyle

Source code statistics
---------------------

	> sbt-stats

SBT Launch useful configuration options
---------------------------------------
Some of these configuration options are quite important to know when setting up a project behind a company proxy.
Configure then in your ~/.sbt/conf/sbtconfig.txt or sbtopts

	# Reserver a decent amount of memory for the SBT JVM  
 
	-Xms256M
 
	-Xmx2048M
 
	-XX:MaxPermSize=256m
 
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
