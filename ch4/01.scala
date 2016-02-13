// discount all of the item costs by the given percentage
def discount(items: Map[String, Double], discount: Double = 0.1): Map[String, Double] = {
  for ((k,v) <- items)
    yield (k, v - (v * discount))
}

// Set of gizmos that the developer covets
var gizmos = Map[String, Double](
    "Gadget A" -> 100,
    "Widget B" -> 500,
    "Doodad C" -> 721
)

discount(gizmos)