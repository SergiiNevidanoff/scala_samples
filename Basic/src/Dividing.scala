sealed trait DivideResult

final case class Finite(value: Double) extends DivideResult

case object Infinite extends DivideResult{
  override def toString: String = "Infinite"
}

object Dividing extends App {

  println(divide(3, 2))
  println(divide(1, 0))

  def divide(first: Int, second: Int) = second match {
    case 0 => Infinite
    case _ => Finite(first*1.0 / second)
  }


}
