package fractal.skeleton

import org.scalatest.PropSpec
import org.scalatest.prop.PropertyChecks
import org.scalatest.Matchers

class PropertyBasedTest extends PropSpec with PropertyChecks with Matchers {

  property("When n is bigger than 1, half n should be more than zero"){
 	forAll { (n: Int) =>
  		whenever (n > 1) { n / 2 should be > 0 }
	}
  }
}
