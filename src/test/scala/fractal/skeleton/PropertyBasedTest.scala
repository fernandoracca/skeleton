package fractal.skeleton

import org.scalacheck.{Gen, Properties}

object PropertyBasedTest extends Properties("SimpleProp") {
  import org.scalacheck.Prop.forAll

  val posInt: Gen[Int] = Gen.posNum[Int].map(x => x + 1)

  property("When n is bigger than 1, half n should be more than zero") = forAll(posInt) { (n: Int) =>
    n / 2 > 0
  }

}
