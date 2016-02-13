import scala.io.Source

def wordCount(txt: String): Map[String, Int] = {
  txt
    .split("\\W+")
    .groupBy(w=>w)
    .mapValues(_.size)
}

val src = Source.fromFile("1984.txt", "UTF-8")
val txt = src.mkString
src.close()

for ((k,v) <- wordCount(txt))
  // TODO: Find length of longest word
  println(k + (" " * (20 - k.length) + v))

