object Counter extends App {

  val counter = Counter().inc().inc().inc().inc().inc().dec().inc()

  case class Counter(value: Int = 0) {
    def inc(): Counter = this.copy(value + 1)

    def dec(): Counter = this.copy(value - 1)
  }

  println(s"Counter ${counter.value}")
}
