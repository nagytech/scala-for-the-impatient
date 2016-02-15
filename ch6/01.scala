object Conversions {
  
  private val i_to_c = 2.54
  private val g_to_l = 3.79
  private val m_to_k = 1.61

  def inchesToCentimeters(inches: Double): Double = {
    inches * i_to_c
  }

  def gallonsToLitres(gallons: Double): Double = {
    gallons * g_to_l
  }

  def milesToKilometers(miles: Double): Double = {
    miles * m_to_k
  }

}

Conversions.inchesToCentimeters(5)
Conversions.gallonsToLitres(5)
Conversions.milesToKilometers(5)