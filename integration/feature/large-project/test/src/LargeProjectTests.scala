package mill.integration

import mill.testkit.IntegrationTestSuite

import utest._

object LargeProjectTests extends IntegrationTestSuite {
  val tests: Tests = Tests {
    initWorkspace()
    test("test") - {

      assert(eval("foo.common.one.compile").isSuccess)
    }
  }
}
