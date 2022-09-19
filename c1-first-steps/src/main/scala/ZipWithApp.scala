import zio._

object ZipWithApp extends ZIOAppDefault {
  import scala.io.StdIn
  val firstName = ZIO.attempt(StdIn.readLine("what is your first name"))
  val lastName = ZIO.attempt(StdIn.readLine("What is your last name"))
  def printLine(line: String) = ZIO.attempt(println(line))
  val result = (firstName zipWith lastName) ((first, last) => s"$first $last")
  def run = result flatMap(printLine) 

}
