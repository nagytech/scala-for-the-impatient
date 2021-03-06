import scala.io.Source
import scala.collection.mutable.Map
import scala.collection.JavaConversions.mapAsScalaMap

// Done using an mutable tree map via Java
def wordCount(txt: String): Map[String, Int] = {
  var map: Map[String, Int] = new java.util.TreeMap[String, Int]
  txt.split("\\W+").foreach({
    w => map(w) = map.getOrElse(w, 0) + 1
  })
  map
}

val src = Source.fromFile("1984.txt", "UTF-8")
val txt = src.mkString
src.close()

for ((k,v) <- wordCount(txt))
    println(k + (" " * (20 - k.length) + v))



