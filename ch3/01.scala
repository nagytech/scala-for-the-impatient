import scala.util.Random

// Returns an array of random integers with the 
// following properties:
// 
//  - the array is 'n' integers long
//  - each integer is bound by 0 (inclusive)
//    and 'n' exclusive
//
def randArray(n: Int): Array[Int] = {
  var arr = Array.ofDim[Int](n)
  for (i <- 0 to n - 1)
    arr(i) = Random.nextInt(n)
  arr
}

randArray(42)
