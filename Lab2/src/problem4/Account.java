package problem4;

public class Account {
	private double balance;
	private int accNumber;

	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}

	public void deposit(double sum) {
		if (sum > 0)
			balance += sum;
		else 
			System.err.println("Deposit value is incorrect");
	}

	public void withdraw(double sum) {
		if (balance >= sum)
			balance -= sum;
		else
			System.err.println("The withdraw value larger than value on your balance");
	}

	public double getBalance() {
		return balance;
	}

	public double getAccountNumber() {
		return accNumber;
	}

	public void transfer(double amount, Account other) {
		this.withdraw(amount);
		other.deposit(amount);
	}

	public String toString() {
		return accNumber + ": $" + balance;
	}

	public final void print() {
		System.out.println("Account number: " + accNumber + " - Balance: $" + balance);
	}
}
