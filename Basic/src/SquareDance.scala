object SquareDance {

  object Calc {
    def square(num: Double): Double = num * num
  }

  object Calc2 {
    def square(num: Int): Int = num * num
    def cube(num: Int) = square(num) * num

    def square(num: Double): Double = num * num
    def cube(num: Double): Double = square(num) * num
  }


}
