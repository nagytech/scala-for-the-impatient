import scala.collection.mutable.ArrayBuffer

def noSort(nums: Array[Int]): Array[Int] = {

  Array.concat(nums.partition(_ > 0))

}

noSort(Array[Int](-5,2,1,0,-3,-4,9))

// Array(2, 1, 9, -5, 0, -3, -4)