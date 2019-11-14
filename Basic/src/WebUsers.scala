object WebUsers extends App {

  sealed trait Visitor

  final case class User(name: String) extends Visitor

  final case class Anonymous() extends Visitor

}
