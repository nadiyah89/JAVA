import java.util.Scanner;

class BankAccount {
    int accNo;
    String name;
    double balance;

    void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Holder Name: ");
        name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account No: " + accNo + ", Holder: " + name + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.createAccount();
        b.deposit(5000);
        b.withdraw(2000);
        b.displayBalance();
    }
}
