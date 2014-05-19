package fractal.skeleton

import collection.mutable.Stack
import org.scalatest._
import org.scalatest.tags.Slow

@Slow
class SlowTest extends FlatSpec with Matchers {

  "A Slow Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]

    stack.push(1)
    stack.push(2)

    Thread.sleep(2000) //Simulate a slow test

    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    } 
  }
}
