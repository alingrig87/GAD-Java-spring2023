package encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("3445554", 2000);
        ba.deposit(1200);
        System.out.println(ba.getBalance());
        ba.withdraw(500);
        System.out.println(ba.getBalance());
    }
}
