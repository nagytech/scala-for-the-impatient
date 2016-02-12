// Iterate through the string "Hello" and
// return the product of all characters as represented
// by their unicode values

val s = "Hello"
var t: Long = 1 // Long is neccessary to avoid truncation

for (c <- s)
  t *= c.toInt

println(t)

// 9415087488 (unlike the book's answer)