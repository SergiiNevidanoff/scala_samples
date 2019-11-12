import UsePerson.Person

object StarWars {

  object StormTrooper {
    def inspect(person: Person): String = person match {
      case Person("Luke", "Skywalker") => "Stop, rebel scum!"
      case Person("Han", "Solo") => "Stop, rebel scum!"
      case Person(first, _) => s"Move along, $first"
    }
  }

}
