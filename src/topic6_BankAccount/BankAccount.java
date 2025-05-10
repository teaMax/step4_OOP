package topic6_BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Недостаточно средств");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
