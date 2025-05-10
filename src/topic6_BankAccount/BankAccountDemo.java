package topic6_BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123455", 354);

        bankAccount.deposit(200);

        bankAccount.withdraw(580);
        bankAccount.withdraw(350);

        System.out.println(bankAccount.getBalance());
    }
}
