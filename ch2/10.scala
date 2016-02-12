// Recursive function that performs some really obscure math
//
// - If n is even and positive:   (x^(n/2))^2
// - If n is odd and positive:    x*x^(n-1)
// - If n is 0:                   1
// - If n is negative:            1/(x^-n)

def fxn(x: Double, n: Int): Double = {
  
  if (n == 0)
  {
    1
  }
  else if (n > 0)
  {
    if (n % 2 == 0) {
      // NOTE: fxn(fxn(x, n / 2), 2) causes infinite depth, so 
      // I'm just using math.pow here.
      math.pow(fxn(x, n / 2), 2)
    } else {
      x * fxn(x, n - 1)
    }
  }
  else // Negative
  {
    1 / fxn(x, -n)
  }

}

println(fxn(5,4))  // 5^4 = 5^4/2 = (5^2)^2, inner recurse to 5^1, then 5*1 ... ((5^2)^2)^2 = 625
println(fxn(5,3))  // 5*5^3-1 = 5*(5^2), recurse as above to end up at 5*25 = 125
println(fxn(5,0))  // 1
println(fxn(5,-1)) // 1 / (5^-(-1) recurse to 5*5^1 = 5), overall 1/5 = 0.2
