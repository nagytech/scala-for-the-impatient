import scala.collection.JavaConversions.propertiesAsScalaMap

val props: scala.collection.Map[String, String] = System.getProperties()

var maxLength = props.keys.map(x=>x.length).max

for ((k, v) <- props)
    printf("%s%s|%s\n", k, " " * (maxLength - k.length + 4), v)


