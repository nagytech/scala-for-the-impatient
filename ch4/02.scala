import scala.io.Source
import scala.collection.mutable.HashMap

def wordCount(txt: String): HashMap[String, Int] = {
  val map = HashMap[String, Int]()
  txt.split("\\s+").foreach(word =>
      if (map.contains(word))
        map(word) += 1 
      else
        map(word) = 1
    )
  map
}

val src = Source.fromFile("1984.txt", "UTF-8")
val txt = src.mkString
src.close()

for ((k,v) <- wordCount(txt))
  // TODO: Find length of longest word
  println(k + (" " * (20 - k.length) + v))

