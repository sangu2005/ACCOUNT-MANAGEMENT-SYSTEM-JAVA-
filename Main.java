import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager manager = new AccountManager();
        
        System.out.println("🏦 Welcome to Account Management System");
        
        while (true) {
            System.out.println("\n1. Create Account\n2. Credit\n3. Debit\n4. Balance\n5. Account Details\n6. Exit");
            System.out.print("Choose operation: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: // Create Account
                    scanner.nextLine();  // Consume newline
                    System.out.print("Full Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Bank Name: ");
                    String bank = scanner.nextLine();
                    manager.createAccount(name, email, phone, bank);
                    break;
                    
                case 2: // Credit
                    System.out.print("Account Number: ");
                    long accNum = scanner.nextLong();
                    Account acc = manager.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Amount to credit: ₹");
                        double amount = scanner.nextDouble();
                        acc.creditAmount(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 3: // Debit
                    System.out.print("Account Number: ");
                    accNum = scanner.nextLong();
                    acc = manager.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Amount to debit: ₹");
                        double amount = scanner.nextDouble();
                        acc.debitAmount(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 4: // Check Balance
                    System.out.print("Account Number: ");
                    accNum = scanner.nextLong();
                    acc = manager.findAccount(accNum);
                    if (acc != null) {
                        System.out.println("Current Balance: ₹" + acc.viewBalance());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 5: // Account Details
                    System.out.print("Account Number: ");
                    accNum = scanner.nextLong();
                    acc = manager.findAccount(accNum);
                    if (acc != null) {
                        acc.displayDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                    
                case 6: // Exit
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}