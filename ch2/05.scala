// This function counts down from n to 0
// and prints each number on a new line.
// It will have no effect if n is less than 0

def countdown(n: Int) {
    for (i <- (0 to n).reverse) {
      println(i)
  }
}       

countdown(5)

//5
//4
//3
//2
//1
//0
