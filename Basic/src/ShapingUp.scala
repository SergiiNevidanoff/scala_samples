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
    def red: ColorIntensity.Value

    def green: ColorIntensity.Value

    def blue: ColorIntensity.Value
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
    override def red: ColorIntensity.Value = ColorIntensity.Light

    override def green: ColorIntensity.Value = ColorIntensity.Light

    override def blue: ColorIntensity.Value = ColorIntensity.Dark
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

    private def colorName(color: Color) = {
      color.getClass.getName
    }
  }

}
