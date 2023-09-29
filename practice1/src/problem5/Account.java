package problem5;

public class Account {
	private double account;
	public int interest;

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	void addInterest(int interest) {
		account += interest * 0.01 * account;
	}
}
