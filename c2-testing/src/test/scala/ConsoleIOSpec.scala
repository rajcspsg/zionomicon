import zio._
import zio.Console
import zio.test.Assertion.equalTo
import zio.test._

object ConsoleIOSpec extends ZIOSpecDefault {
  val greet: ZIO[Any, Nothing, Unit] = for {
    name <- Console.readLine.orDie
    _ <- Console.printLine(s"Hello, $name").orDie
  } yield ()

  def spec = suite("ExampleSpec")(
    test("greet says hello to the user") {
      for {
        _ <- TestConsole.feedLines("Jack")
        _ <- greet
        value <- TestConsole.output
      } yield assert(value) (equalTo(Vector("Hello, Jack")))
    }
  )
}