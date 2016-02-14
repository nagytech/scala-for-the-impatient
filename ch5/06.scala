class Person(private var years: Int = 0) {
  def age = years
  def age_=(newValue: Int) {
    if (newValue > years) years = newValue; 
  }
  years = 0 max years
}

new Person(-1).age