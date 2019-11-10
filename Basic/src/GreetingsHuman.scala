object GreetingsHuman {

  object Person {
    val firstName = ""
    val lastName = ""
  }

  object Alien {
    def greet(person: Person.type) = s"Hello, ${person.firstName} !"
  }

}
