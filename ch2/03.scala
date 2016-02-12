// One way that x=y=1 can be considered valid in scala
// is if both x and y are declared as 'var'.  That way
// the values of x and y can be reassigned after their
// initial assignment. 

var y = 0
var x = y = 1
