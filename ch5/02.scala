class BankAccount(private[this] var funds: Double = 0) {
  def balance = funds
  def deposit(amount: Double) {
    funds += amount
  }
  def withdraw(amount: Double) {
    funds -= amount
  }
}

val b = new BankAccount
b.deposit(100) 
b.balance // 100
b.withdraw(25)
b.balance // 75