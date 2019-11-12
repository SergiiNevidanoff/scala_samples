object CatOMatique extends App {

  val oswald = Cat(name = "Oswald", colour = "Milk", food = "Milk")
  val henderson = Cat(name = "Oswald", colour = "Chips", food = "Ginger")
  val quentin = Cat(name = "Quentin", colour = "Tabby and white", food = "Curry")

  trait Feline {
    def colour: String

    def sound: String
  }

  trait BigCat extends Feline {
    override val sound = "roar"
  }

  case class Cat(name: String, colour: String, food: String) extends Feline {
    override val sound: String = "meow"
  }

  case class Tiger(colour: String) extends BigCat

  case class Lion(colour: String, maneSize: Int) extends BigCat

  case class Panther(colour: String) extends BigCat

  object ChipShop {
    def willServe(cat: Cat): Boolean = cat match {
      case Cat(_, _, "Chips") => true
      case _ => false
    }
  }


}
