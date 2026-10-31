
public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("A befizetés összege csak pozitív lehet.");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
