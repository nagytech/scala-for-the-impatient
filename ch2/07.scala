// The same functionality as 06, but represented in a single line
// without a loop.

// The map function returns a sequence of Longs that represent
// the unicode values of "Hello", then 'product' is called on 
// the sequence to compute the total product.

"Hello".map(_.toLong).product