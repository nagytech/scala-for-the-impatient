class Person(name: String) { 

  private[this] val split = name.split("\\s")

  val firstName = split._1
  val lastName = split._2

}

// NOTE: Firstly, the param 'name' should be val
// since it should be implied that the person's
// name will not change, and this it is immutable.
//
// The 'name' parameter could be implemented as 
// a plain parameter so that no field is created.
// Alternatively, the parameter could be made readonly 
// in order to retain the fullly formatted name
// for later utilization.  It's simply a matter
// of preference based on optimization requirements.
