def lteqgt(values: Array[Int], v: Int) = {

  val split = values.partition(_ <= v)
  val eqs = split._1.count(_ == v)
  var lts = split._1.length - eqs
  var gts = split._2.length

  (lts, eqs, gts)

}

lteqgt(Array(1,2,3,4,5,6), 4)