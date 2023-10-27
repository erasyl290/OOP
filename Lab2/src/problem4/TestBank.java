package problem4;

import java.util.Vector;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1);
		acc.deposit(500);
		acc.withdraw(200);
		
		SavingsAccount sa = new SavingsAccount(2);
		sa.deposit(300);
		acc.transfer(100, sa);
		sa.setInterest(10);
		sa.addInterest();
		
		CheckingAccount ca = new CheckingAccount(3);
		ca.deposit(300);
		for(int i = 0; i < 6; i++)
			ca.withdraw(1);

		System.out.println(acc);
		System.out.println(sa);
		System.out.println(ca);

		Vector<Account> list = new Vector<Account>();
		list.add(acc);
		list.add(sa);
		list.add(ca);

		Bank bank = new Bank(list);
		bank.open(4, 100);
		bank.open(5, 200, 'S');
		bank.open(6, 300, 'C');
		bank.close(1);
		bank.close(2);
		bank.close(3);
		bank.update(5);
		System.out.println(bank);
	}

}
