package object random {
  private val a = 1664525
  private val b = 1013904223
  private val n = 32
  private val seq = (a + b % (2 * n))
  private var seed: Int = 0
  def nextInt(): Int = {
    seed = seed * seq
    seed
  }
  def nextDouble(): Double = {
    seed = seed * seq
    1.0 / seed
  }
  def setSeed(seed: Int): Unit = {
    this.seed = seed
  }
}
