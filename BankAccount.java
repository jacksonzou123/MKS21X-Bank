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
	public boolean deposit(double money) {
		if (money >= 0) {
			balance += money;
			return true;
		}
		return false;
	}
	public boolean withdraw(double money) {
		if (balance >= money) {
			balance -= money;
			return true;
		}
		return false;
	}
	private boolean authenticate(String attempt) {
		return password == attempt;
	}
	public boolean transferTo(BankAccount other, double amount, String password) {
		if (authenticate(password) && withdraw(amount)) {
			other.deposit(amount);
		}
	}
}
