import ShapingUp.ColorIntensity

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

  sealed trait Color {
    def red: Int = 0

    def green: Int = 0

    def blue: Int = 0
  }

  case class Circle(radius: Int) extends Shape {
    override def sides: Int = 0

    override def perimeter: Double = 2 * Math.PI * radius

    override def area: Double = Math.PI * radius * radius
  }

  case class Rectangle(width: Int, height: Int) extends Rectangular

  case class Square(side: Int) extends Rectangular {
    override def height: Int = side

    override def width: Int = side
  }

  object Yellow extends Color {
    override def red: Int = 255

    override def green: Int = 255
  }

  object Red extends Color {
    override def red: Int = 255
  }

  object Pink extends Color {
    override def red: Int = 255

    override def green: Int = 192

    override def blue: Int = 203
  }

  object ColorIntensity extends Enumeration {
    val Light, Dark = Value
  }

  object Draw {
    def apply(shape: Shape, color: Color): String = shape match {
      case Circle(radius) => s"A ${colorName(color)} circle of radius $radius cm"
      case Rectangle(width, height) => s"A ${colorName(color)} rectangle of width $width cm and height $height cm"
      case Square(side) => s"A ${colorName(color)} square with each side of $side cm"
    }

    private def colorName(color: Color) = color match {
      case Red => "red"
      case Yellow => "yellow"
      case Pink => "pink"
      case _ => "Unknown"
    }
  }

}
