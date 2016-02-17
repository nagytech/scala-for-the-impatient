class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def charge(amount: Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private val freeTransactions: Int = 1
  private val chargePerTransaction: Double = 1
  private var transactionsThisMonth: Int = 0
  override def deposit(amount: Double) = {
    transact(super.deposit(amount))
  }
  override def withdraw(amount: Double) = {
    transact(super.withdraw(amount))
  }
  private def transact(func: => Double) = {
    // TODO: Thread locking, etc.
    if (transactionsThisMonth >= 3)
      super.charge(chargePerTransaction)
    transactionsThisMonth += 1
    func
  }
}

val s = new SavingsAccount(100)
s.withdraw(1)
println(s.currentBalance)
s.withdraw(1)
println(s.currentBalance)
s.withdraw(1)
println(s.currentBalance)
s.deposit(4)
println(s.currentBalance)