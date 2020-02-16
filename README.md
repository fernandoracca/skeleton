Skeleton
------------

This project aims to simplify creating a project from scratch, ready to use in your IDE.
It's arguably simpler than Typesafe activator or g8 because it doesn't require any additional tools, just clone, build and run.
It provides a simple way to have a project running with the following tools configured:

     Scala 2.13 with strict compiler flags
     SBT 1.3+
     ScalaTest 3.2+
     ScalaCheck for Property Based testing
     Scalafmt for automated code formatting

Requires
---------------
* Please download latest version of SBT. As of last publication of Skeleton:
* [sbt 1.3.8](http://www.scala-sbt.org)

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
Great Scala support on: 

  * [Intellij IDEA 2019.3](http://www.jetbrains.com/idea/download/) 
  * [Visual Studio Code](https://code.visualstudio.com/)
	Plugin: [Metals](https://marketplace.visualstudio.com/items?itemName=scalameta.metals) 

Test
------------------
The best feature of SBT is incremental compilation. This is most evident when testing.

	> ~ test

Be warned, it's addictive. You'll never want to code in any other statically compiled language without this feature.

Test a single TestSuite

	> test-only package.subpackage.Class

Useful commands
-----------------
Run a scala REPL with all the project dependencies available. 

	> console

Run will auto scan and run a Main class.

	> run
Automatic code formatting with:	

	> scalafmtAll

Multi Project Version:
-----------------------

Multiple modules and package and deployment.

[fractal/multi-project-skeleton](https://github.com/fractal/multi-project-skeleton)


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


