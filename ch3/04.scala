import scala.collection.mutable.ArrayBuffer

def noSort(nums: Array[Int]): Array[Int] = {

  var pos = ArrayBuffer[Int]()
  var neg = ArrayBuffer[Int]()

  for (num <- nums) {
    if (num > 0)
      pos += num
    else
      neg += num
  }

  (pos ++= neg).toArray

}

noSort(Array[Int](-5,2,1,0,-3,-4,9))