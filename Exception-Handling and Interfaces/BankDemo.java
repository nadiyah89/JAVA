import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;
    SavingsAccount(double initial) { balance = initial; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount > balance) throw new ArithmeticException("Insufficient funds!");
        balance -= amount;
    }
    public double getBalance() { return balance; }
}

public class BankDemo {
    public static void main(String[] args) {
        try {
            SavingsAccount acc = new SavingsAccount(1000);
            acc.deposit(500);
            acc.withdraw(200);
            System.out.println("Balance: " + acc.getBalance());
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
