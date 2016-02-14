class Car(
    val make:   String,
    val model:  String,
    val year:   Int = -1,
    var plate:  String = "") {
}

// The primary constructor contains all 
// parameters (mandatory and optional).
// There is no need to create aux 
// constructors since the primary can handle
// all permutations of options.

new Car("Blurfu", "Palabla")
new Car("Blurfu", "Palabla", 10)
new Car("Blurfu", "Palabla", 10, "AL30AE")
val c = new Car("Blurfu", "Palabla", plate = "AL30AE")
c.plate = "BL02WE"

