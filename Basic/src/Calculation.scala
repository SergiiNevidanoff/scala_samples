sealed trait WaterSource

final case class BottledWater(size:Int, source:WaterSource, carbonated:Boolean)

object Calculation extends App {

  sealed trait Calculation

  final case class Success(result: Int) extends Calculation

  final case class Failure(reason: String) extends Calculation

}

case object Well extends WaterSource

case object Spring extends WaterSource

case object Tap extends WaterSource
