// Swap neighbouring positions in an array without 
// overlapping.

def arrSwap(a: Array[Int]): Array[Int] = {

  val newArr = Array.ofDim[Int](arr.length)

  for (i <- 0 until arr.length if i % 2 == 0 && i + 1 < arr.length)
  {
    var j = i + 1
    newArr(j) = arr(i)
    newArr(i) = arr(j)
  }

  if (arr.length % 2 == 1)
    newArr(arr.length - 1) = arr(arr.length - 1)

  newArr

}

val arr = Array[Int](1, 2, 3, 4, 5)
val swappedArr = arrSwap(arr)

println(swappedArr.mkString("(", ",", ")"))