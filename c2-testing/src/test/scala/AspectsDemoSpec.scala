import zio._
import zio.test._
import zio.test.Assertion._
import zio.test.TestAspect._

object AspectsDemoSpec extends ZIOSpecDefault {

  def spec = suite("AspectDemoSpec")(
    test("this test will be repeated to ensure it is stable") {
      assertZIO(ZIO.succeed(1 + 1))(equalTo(2))
    } @@ nonFlaky
  )
}
