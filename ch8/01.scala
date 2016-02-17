class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def charge(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private val chargePerTransaction: Double = 1
  override def deposit(amount: Double) = {
    super.charge(1)
    super.deposit(amount)
  }
  override def withdraw(amount: Double) = {
    super.charge(1)
    super.withdraw(amount)
  }
}