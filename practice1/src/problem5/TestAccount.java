package problem5;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setAccount(100000);
		account.addInterest(5);
		System.out.println(account.getAccount());
	}

}
