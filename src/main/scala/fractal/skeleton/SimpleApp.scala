package fractal.skeleton

object SimpleApp {

  def main(args: Array[String]): Unit = {
    println("What is the meaning of Life, the Universe, and Everything?")
    Thread.sleep(2000)
    println(s"The answer is: ${Quiz.theAnswer}")
  }
}

object Quiz {
  val theAnswer = 42
}
