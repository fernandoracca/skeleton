package fractal.skeleton

object SimpleApp extends App {
	println("What is the meaning of Life, the Universe, and Everything?")
	lazy val theAnswer = 42 
	Thread.sleep(2000)
	println (s"The answer is: ${theAnswer}")

}
