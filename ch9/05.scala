import scala.collection.immutable.HashMap

object PowerReciprocal {
  protected var maxResultLength: Int = 0
}

class PowerReciprocal(val base: Int, val power: Int) {
  private lazy val _result: Int = Math.pow(base, power).toInt
  private lazy val _reciprocal: Double = 1.0 / _result
  private lazy val _resultLength: Int = _result.toString.length

  if (PowerReciprocal.maxResultLength < _resultLength)
    PowerReciprocal.maxResultLength = _resultLength

  def printOutTableRow {
    printf("%d    %s%.7f\n", _result, " " * (PowerReciprocal.maxResultLength - _resultLength), _reciprocal)
  }

}

val prs = for (i <- 0 to 20) yield new PowerReciprocal(2, i)

for (pr <- prs)
  pr.printOutTableRow

