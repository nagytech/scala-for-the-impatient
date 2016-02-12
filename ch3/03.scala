// Swap neighbouring positions in an array without 
// overlapping.

def arrSwap(arr: Array[Int]): Array[Int] = {

  (for (i <- 0 until arr.length)
    yield
      if (i % 2 == 0)
        if (arr.length > 1 && i < arr.length - 1)
          arr(i + 1)
        else
          arr(i)
      else
        arr(i - 1)
  )

}

val arr = Array[Int](1, 2, 3, 4, 5)
val swappedArr = arrSwap(arr)

println(swappedArr.mkString("(", ",", ")"))