import zio._

object GroceryStoreApp extends ZIOAppDefault {

  val goShopping = ZIO.attempt(println("Going to the shopping store"))

  val goShoppingLater = goShopping.delay(1.minute)

  def run = goShoppingLater
}
