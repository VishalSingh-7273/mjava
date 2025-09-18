// BankAccount.java
class BankAccount {
    // Attributes
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + " successfully.");
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn Rs. " + amount + " successfully.");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("------------------------------------");
    }
}

// Main class
public class ATMSimulation {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount acc1 = new BankAccount("Priyanshu Chauhan", 123456, 10000.0);

        // Display initial balance
        acc1.displayBalance();

        // Deposit money
        acc1.deposit(5000);

        // Withdraw money
        acc1.withdraw(3000);

        // Try withdrawing more than balance
        acc1.withdraw(20000);

        // Display final balance
        acc1.displayBalance();
    }
}
