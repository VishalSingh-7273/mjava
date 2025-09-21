package KeyWordAndInstanceOperatorLevel1;

public class BankAccount {
    private static String bankName = "Canara Bank";
    private static int totalAccounts = 0;
    private String accountHolder;
    private double balance;
    private  final int accountNumber;
    public BankAccount(String accountHolder, double balance ,int accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
        this.accountNumber = accountNumber;
    }

    public void displayAccountDetails() {
       if(this instanceof BankAccount){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

        public static void getTotalAccounts() {
            System.out.println("Total Accounts: " + totalAccounts);
        }
    

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("vishal", 1000.0, 12345);
        BankAccount bank1 = new BankAccount("Rahul", 2000.0, 67890);
        bank.displayAccountDetails();
        bank1.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}


