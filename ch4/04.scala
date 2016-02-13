import scala.io.Source
import scala.collection.immutable.TreeMap

// Sorted map
def wordCount(txt: String): TreeMap[String, Int] = {
  var map = TreeMap[String, Int]()
  txt.split("\\W+").foreach({
    w => map = map + (w -> (map.getOrElse(w, 0) + 1))
  })
  map
}

val src = Source.fromFile("1984.txt", "UTF-8")
val txt = src.mkString
src.close()

for ((k,v) <- wordCount(txt))
  println(k + (" " * (20 - k.length) + v))

