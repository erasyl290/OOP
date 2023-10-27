package problem4;

public class CheckingAccount extends Account {
	private final int FREE_TRANSACTIONS = 5;
	private int counter;
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	public void deductFee() {
		if (counter >= FREE_TRANSACTIONS)
			super.withdraw(0.02);
		counter++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		deductFee();
	}
	
	public String toString() {
		return super.toString() + " with " + counter + " transactions made";
	}
}
