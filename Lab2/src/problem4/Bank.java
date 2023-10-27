package problem4;

import java.util.Vector;

public class Bank {
	private Vector<Account> bankList = new Vector<Account>();

	public Bank() {
	}

	public Bank(Vector<Account> bankList) {
		this.bankList = bankList;
	}

	public void update(double sum) {
		for (Account a : bankList) {
			a.deposit(sum);
			if (a.getClass() == SavingsAccount.class)
				((SavingsAccount) a).addInterest();
			else if (a.getClass() == CheckingAccount.class)
				((CheckingAccount) a).deductFee();
		}
	}

	public void open(int a, double sum) {
		Account acc = new Account(a);
		acc.deposit(sum);
		bankList.add(acc);
	}

	public void open(int a, double sum, char c) {
		if (c == 'S') {
			SavingsAccount acc = new SavingsAccount(a);
			acc.deposit(sum);
			bankList.add(acc);
		} else if (c == 'C') {
			CheckingAccount acc = new CheckingAccount(a);
			acc.deposit(sum);
			bankList.add(acc);
		} else {
			Account acc = new Account(a);
			acc.deposit(sum);
			bankList.add(acc);
		}
	}

	public void close(int a) {
		for (int i = 0; i < bankList.size(); i++) {
			if (bankList.elementAt(i).getAccountNumber() == a)
				bankList.remove(i);
		}
	}

	public String toString() {
		String bankList = "Accounts list...\n";
		for (Account a : this.bankList)
			bankList += a + "\n";
		bankList += "End of the list...";
		return bankList;
	}
}
