import scala.collection.mutable.ArrayBuffer

def noSort(nums: Array[Int]): Array[Int] = {

  var res = ArrayBuffer[Int]()
  val part = nums.partition(_ > 0)
  res ++= part._1
  res ++= part._2
  res

}

noSort(Array[Int](-5,2,1,0,-3,-4,9))

// Array(2, 1, 9, -5, 0, -3, -4)