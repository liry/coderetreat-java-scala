package coderetreat.scala

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GameOfLifeSuite extends FunSuite {

  test("True is true") {
    val a = true
    val b = true
    assert(a == b)
  }

}
