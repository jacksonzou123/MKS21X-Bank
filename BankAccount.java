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
	private boolean authenticate(String password) {
		return this.password == password;
	}
	public boolean transferTo(BankAccount other, double amount, String password) {
		return authenticate(password) && withdraw(amount) && other.deposit(amount);
	}
}
