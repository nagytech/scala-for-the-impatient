// This file packages the previous answer into a callable
// function
def product(s: String) : Long = {
  s.map(_.toLong).product  
}

println(product("Hello"))