import scala.util.Random

// Generate a random filename by getting
// a random integer and converting it to 
// base36.
val rand: BigInt = Random.nextInt
rand.toString(36)
