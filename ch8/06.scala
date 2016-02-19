class Point(val x: Double, val y: Double)

abstract class Shape {
  def centerPoint: Point
}

class Circle(val centerPoint: Point, val radius: Double)

class Rectangle(val topLeft: Point, val bottomRight: Point) {
  // TODO: Can we make this lazy?
  def centerPoint(): Point = {
    new Point(
      (topLeft.x + bottomRight.x) / 2,
      (topLeft.y + bottomRight.y) / 2
    )
  }
}