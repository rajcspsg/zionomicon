import zio._
import zio.test.Assertion.equalTo
import zio.test._
import zio.test.ZIOSpecDefault

object PropertyBasedTestingSpec extends ZIOSpecDefault {

  val intGen: Gen[Any, Int] = Gen.int

  override def spec = suite ("Property based testing") (
    test("integer addition is associative") {
      check(intGen, intGen, intGen) { (x, y, z) =>
        val left = (x + y) + z
        val right = x + (y + z)
        assert(left) (equalTo(right))
      }
    }
  )
}
