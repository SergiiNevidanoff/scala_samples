import WebUsers.{Anonymous, User, Visitor}

object WebUsers extends App {

  sealed trait Visitor

  final case class User(name: String) extends Visitor

  final case class Anonymous() extends Visitor

}

object EmailService {

  def sendEmail(visitor: Visitor) = visitor match {
    case User(name: String) => println(s"Sending email to $name")
    case Anonymous() =>
  }

}
