package problem4;

public class SavingsAccount extends Account {
	private static int interest;
	
	public SavingsAccount(int a) {
		super(a);
	}
	
	public void setInterest(int interest) {
		if (interest > 0 && interest <= 100)
			SavingsAccount.interest = interest;
		else
			System.err.println("Interest rate must be between 1 and 100 (included)");
	}
	
	public void addInterest() {
		super.deposit(getBalance() * interest * 0.01);
	}
	
	public double getInterest() {
		return interest;
	}
	
	public String toString() {
		return super.toString() + " with interest rate " + interest + "%";
	}
}
