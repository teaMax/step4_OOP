package topic6_BankAccount;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Невозможно положить: " + amount);
        } else balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Недостаточно средств");
        } else  balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
