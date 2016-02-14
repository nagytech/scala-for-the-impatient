class Counter(private[this] var value: BigInt = 0) {
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}

val c = new Counter(Int.MaxValue)
c.increment()
c.current
