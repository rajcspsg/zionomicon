import zio.test.{TestClock, ZIOSpecDefault, assertCompletes}
import zio._

object ClockSpec extends ZIOSpecDefault {

  val goShopping: ZIO[Any, Nothing, Unit] = Console.printLine(s"Going Shopping").orDie.delay(1.hour)

  def spec = suite("ExampleSpec") (
    test("goShopping delays one hour") {
      for {
        fiber <- goShopping.fork
        _ <- TestClock.adjust(1.hour)
        _ <- fiber.join
      } yield assertCompletes
    }
  )
}
