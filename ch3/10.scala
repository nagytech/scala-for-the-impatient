import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

val imageFlavors: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
