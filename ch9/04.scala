val floats = scala.io.Source.stdin.getLines.map(x=>x.toFloat).toArray

var sum = floats.sum
printf("Sum: %f\n", sum)
printf("Avg: %f\n", (sum / floats.length))
printf("Max: %f\n", floats.max)
printf("Min: %f\n", floats.min)