class UnitConversion(val constant: Double) {
  def forward(m: Double): Double = m * constant
  def reverse(m: Double): Double = m / constant
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.79)
object MilesToKilometers extends UnitConversion(1.61)