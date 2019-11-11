object Counter extends App {

  val counter = Counter().inc(10).inc(10).inc(5).inc(3).inc(2).dec(5).inc(2)

  case class Adder(amount: Int) {
    def apply(in: Int): Int = in + amount
  }

  case class Counter(value: Int = 0) {
    def inc(step: Int = 1): Counter = this.copy(value + step)

    def dec(step: Int = 1): Counter = this.copy(value - step)

    def adjust(adder: Adder): Counter = this.copy(adder(value))
  }

  println(s"Counter ${counter.value}")
  println(s"Counter with adder => ${Counter(10).adjust(Adder(150))}")
}
