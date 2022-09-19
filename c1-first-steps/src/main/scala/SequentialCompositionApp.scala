import zio._
object SequentialCompositionApp extends ZIOAppDefault {

  import scala.io.StdIn
  val readLine = ZIO.attempt(StdIn.readLine())
  def printLine(line: String) = ZIO.attempt(println(line))
  val echo = readLine.flatMap(line => printLine(line))
  def run = echo
}
