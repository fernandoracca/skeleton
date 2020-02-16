package fractal.skeleton

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

class SimpleAppTest extends AnyFreeSpec with Matchers {

  "The Answer" - {
    "is always 42" in {
      Quiz.theAnswer must be(42)
    }
  }
}
