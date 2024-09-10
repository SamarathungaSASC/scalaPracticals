object bank {

  case class Account(accountNumber: String, balance: Double)

  class Bank(accounts: List[Account]) {

    def negativeBalanceAccounts(): List[Account] = {
      accounts.filter(_.balance < 0);
    }

    def totalBalance(): Double = {
      accounts.map(_.balance).sum;
    }
    def applyInterest(): List[Account] = {
      accounts.map { account =>
        val interestRate = if (account.balance >= 0) 0.05 else 0.1;
        val newBalance = account.balance + (account.balance * interestRate);
        account.copy(balance = newBalance);
      }
    }
  }

    def main(args: Array[String]): Unit = {
    // list of accounts
    val accounts = List(
      Account("A001", 500.0),
      Account("A002", -200.0),
      Account("A003", 1000.0),
      Account("A004", -50.0)
    );

    val bank = new Bank(accounts);

    val negativeAccounts = bank.negativeBalanceAccounts();
    println(s"Accounts with negative balances: $negativeAccounts");

    val totalBalance = bank.totalBalance();
    println(s"Total balance of all accounts: $totalBalance");

    val accountsWithInterest = bank.applyInterest();
    println(s"Accounts after applying interest: $accountsWithInterest");
  }
}
