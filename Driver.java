public class Driver{
  public static void main(String[] args) {
    BankAccount bank = new BankAccount(1000, 123456, "jackson");
    System.out.println(bank);
    if (bank.deposit(1000)) {
      System.out.println("Deposit successful");
    }
    else {
      System.out.println("Deposit failed");
    }
    System.out.println(bank);
    if (bank.withdraw(10000)) {
      System.out.println("Withdrawal successful");
    }
    else {
      System.out.println("Withdrawal failed");
    }
    System.out.println(bank);
  }
}
