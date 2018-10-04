public class BankAccount{
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double newbalance, int newaccountID, String newpassword) {
		balance = newbalance;
		accountID = newaccountID;
		password = newpassword;
	}
	public String toString() {
		return accountID + "\t" + balance;
	}
	public boolean deposit(int money) {
		if (money >= 0) {
			balance += money;
			return true;
		}
		return false;
	}
}
