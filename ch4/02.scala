import scala.io.Source
import scala.collection.mutable.HashMap

// Using a mutable map
def wordCount(txt: String): HashMap[String, Int] = {
  val map = HashMap[String, Int]()
  txt.split("\\W+").foreach(w =>
      map(w) = map.getOrElse(w, 0) + 1
  )
  map
}

val src = Source.fromFile("1984.txt", "UTF-8")
val txt = src.mkString
src.close()

for ((k,v) <- wordCount(txt))
  println(k + (" " * (20 - k.length) + v))

