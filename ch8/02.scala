class BankAccount(initialBalance: Double) {
  protected[this] var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def charge(amount: Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private val freeTransactions: Int = 1
  private val chargePerTransaction: Double = 1
  private val interestRate: Double = 0.04
  private var transactionsThisMonth: Int = 0
  override def deposit(amount: Double) = {
    transact(super.deposit(amount))
  }
  override def withdraw(amount: Double) = {
    transact(super.withdraw(amount))
  }
  def earnMonthlyInterest() {
    // TODO: Thread locking, etc
    balance += balance * interestRate
    transactionsThisMonth = 0
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
s.withdraw(1) // 100 - 1 = 99
println(s.currentBalance)
s.withdraw(1) // 99 - 1 = 98
println(s.currentBalance)
s.withdraw(1) // 98 - 1 = 97
println(s.currentBalance)
s.deposit(4) // 97 + 4 - 1 = 100
println(s.currentBalance)
s.earnMonthlyInterest() // 100 + 0.04% = 104
println(s.currentBalance)
s.deposit(4) // 100 + 4 = 104
println(s.currentBalance)
