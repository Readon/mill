import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.Tag

object Tagged extends Tag("tagged")

class MyAppSpec extends AnyFunSuite {
  test("Addition should work correctly") {
    assert(MyApp.add(2, 3) == 5)
    println("untagged run")
  }
  test("Addition test with tag", Tagged) {
    assert(MyApp.add(2, 3) == 5)
    println("tagged run")
  }
}
