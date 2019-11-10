object DirectorialDebut extends App {

  val eastwood = Director("Clint", "Eastwood", 1930)
  val mcTiernan = Director("John", "McTiernan", 1951)
  val nolan = Director("Christopher", "Nolan", 1970)
  val someBody = Director("Just", "Some Body", 1990)
  val memento = Film("Memento", 2000, 8.5, nolan)
  val darkKnight = Film("Dark Knight", 2008, 9.0, nolan)
  val inception = Film("Inception", 2010, 8.8, nolan)
  val highPlainsDrifter = Film("High Plains Drifter", 1973, 7.7, eastwood)
  val outlawJoseyWales = Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
  val unforgiven = Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino = Film("Gran Torino", 2008, 8.2, eastwood)
  val invictus = Film("Invictus", 2009, 7.4, eastwood)
  val predator = Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard = Film("Die Hard", 1988, 8.3, mcTiernan)
  val huntForRedOctober = Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
  val thomasCrownAffair = Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

  case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
    val fullName = s"${firstName} ${lastName}"

    def copy(firstName: String = this.firstName,
             lastName: String = this.lastName,
             yearOfBirth: Int = this.yearOfBirth
            ) = Director(firstName, lastName, yearOfBirth)
  }

  case class Film(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {
    val directorAge: Int = yearOfRelease - director.yearOfBirth

    def copy(
              name: String = this.name,
              yearOfRelease: Int = this.yearOfRelease,
              imdbRating: Double = this.imdbRating,
              director: Director = this.director.copy()): Film = Film(name, yearOfRelease, imdbRating, director)

    def isDirectedBy(director: Director): Boolean = ???
  }

}
