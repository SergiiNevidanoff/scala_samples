object ShapingUp extends App {

  sealed trait Shape {
    def sides: Int

    def perimeter: Double

    def area: Double
  }

  sealed trait Rectangular extends Shape {
    def width: Int

    def height: Int

    override def sides: Int = 4

    override def perimeter: Double = 2 * (width + height)

    override def area: Double = width * height
  }

  case class Circle(radius: Int) extends Shape {
    override def sides: Int = 0

    override def perimeter: Double = 2 * Math.PI * radius

    )

    override def area: Double = Math.PI * radius * radius
  }

  case class Rectangle(width: Int, height: Int) extends Rectangular

  case class Square(side: Int) extends Rectangular {
    override def width: Int = side

    override def height: Int = side
  }

}
