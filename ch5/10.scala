class Employee {
  private var _name: String = "John Q. Public"
  private var _salary: Double = 0.0
  def this(name: String, salary: Double) {
    this()
    _name = name;
    _salary = salary;
  }
  def name = _name;
  def salary = _salary
}

// The prior method with implicit properties and fully 
// loaded primary constructor is much less verbose.
// As a result, it seems preferrable to have a loaded 
// primary constructor and provide an aux no-arg 
// constructor if neccessary.