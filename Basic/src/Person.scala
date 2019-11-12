object UsePerson extends App {

  case class Person(firstName: String, lastName: String) {
    def name: String = s"$firstName $lastName"
  }

  object Person {
    def apply(fullName: String): Person = {
      val nameParts = fullName.split("\\s+")
      Person(nameParts(0), nameParts(1))
    }
  }

  println(Person("John Smith"))
}
