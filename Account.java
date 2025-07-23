public class Account {
    private String accountHolderName;
    private String email;
    private String phone;
    private String bankName;
    private long accountNumber;
    private long accountId;
    private double balance;

    public Account(String accountHolderName, String email, String phone, String bankName, 
                  long accountNumber, long accountId) {
        this.accountHolderName = accountHolderName;
        this.email = email;
        this.phone = phone;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountId = accountId;
        this.balance = 0.0;  // Default balance
    }

    // Credit amount to account
    public void creditAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " credited. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Debit amount from account
    public void debitAmount(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " debited. Remaining balance: ₹" + balance);
        }
    }

    // Check current balance
    public double viewBalance() {
        return balance;
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Account ID: " + accountId);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }
}