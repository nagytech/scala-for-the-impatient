import scala.io.Source

// Input from stdin, gets reversed
val src = Source.stdin
for (l <- src.getLines.toArray.reverse)
  println(l)

src.close