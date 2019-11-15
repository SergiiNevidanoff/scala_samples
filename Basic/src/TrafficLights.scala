sealed trait TrafficLight

case object Red extends TrafficLight

case object Green extends TrafficLight

case object Yellow extends TrafficLight

object TrafficController {
  def nextLight(currentLight: TrafficLight): TrafficLight = currentLight match {
    case Red => Green
    case Green => Yellow
    case Yellow => Red
  }
}

object TrafficLights extends App {

}
