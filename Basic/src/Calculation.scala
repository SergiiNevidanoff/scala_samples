import Calculation.{Calculation, Failure, Success}

sealed trait WaterSource

final case class BottledWater(size: Int, source: WaterSource, carbonated: Boolean)

object Calculator extends App {
  def +(calculation: Calculation, extra: Int): Calculation = calculation match {
    case Failure(reason) => Failure(reason)
    case Success(result) => Success(result + extra)
  }

  def /(calculation: Calculation, extra: Int): Calculation = calculation match {
    case Failure(reason) => Failure(reason)
    case Success(0) => Failure("Division by zero")
    case Success(result) => Success(result + extra)
  }

  def -(calculation: Calculation, extra: Int): Calculation = calculation match {
    case Failure(reason) => Failure(reason)
    case Success(result) => Success(result - extra)
  }

  println(s"Failure(wrong) result is ${Calculator.+(Failure("wrong"), 10)}")
  println(s"+ result ${Calculator.+(Success(10), 20)}")
  println(s"- result ${Calculator.-(Success(10), 20)}")
}

object Calculation extends App {

  sealed trait Calculation

  final case class Success(result: Int) extends Calculation

  final case class Failure(reason: String) extends Calculation

}

case object Well extends WaterSource

case object Spring extends WaterSource

case object Tap extends WaterSource
