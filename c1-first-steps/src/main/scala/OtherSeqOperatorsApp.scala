import zio._

object OtherSeqOperatorsApp extends ZIOAppDefault {

  def printLine(line: String) = ZIO.attempt(println(line))
  def printA[A](line: A) = ZIO.attempt(println(line))

  val result: Task[IndexedSeq[Unit]] = ZIO.foreach(1 to 100){n => printLine(n.toString)}

  val collectResult: Task[IndexedSeq[Int]] = ZIO.collectAll((1 to 10) map (num => ZIO.succeed(num)))
  def run = collectResult flatMap (x => printA(x))
}
