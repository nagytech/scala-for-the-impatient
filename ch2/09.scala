// This function acts recursively upon the string by 
// taking the product of the head (first character)
// and the function's return value for the tail
// (all characters but the first).  When the recursion
// reaches the 'bottom', a 1 is returned and the multiplication 
// is executed up the chain.

def product(s: String) : Long = {
  
  if (s.length > 0)
    product(s.tail) * s.head
  else
    1

}

println(product("Hello"))