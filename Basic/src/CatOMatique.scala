object CatOMatique extends App {

  val oswald = Cat(name = "Oswald", colour = "Milk", food = "Milk")
  val henderson = Cat(name = "Oswald", colour = "Chips", food = "Ginger")
  val quentin = Cat(name = "Quentin", colour = "Tabby and white", food = "Curry")

  case class Cat(val name: String, val colour: String, val food: String)

  object ChipShop {
    def willServe(cat: Cat): Boolean = cat match {
      case Cat(_, _, "Chips") => true
      case _ => false
    }
  }

  object Cat1 {
    val name = "Oswald"
    val colour = "Black"
    val food = "Milk"
  }

  object Cat2 {
    val name = "Henderson"
    val colour = "Ginger"
    val food = "Chips"
  }

  object Cat3 {
    val name = "Quentin"
    val colour = "Tabby and white"
    val food = "Curry"
  }

}
