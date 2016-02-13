import java.util.Calendar._

val lmap = scala.collection.mutable.LinkedHashMap(
    "MONDAY" -> MONDAY,
    "TUESDAY" -> TUESDAY,
    "WEDNESDAY" -> WEDNESDAY,
    "THURSDAY" -> THURSDAY,
    "FRIDAY" -> FRIDAY
)

for ((k,v) <- lmap)
  printf("%d,%s\n", v, k)