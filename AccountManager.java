import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountManager {
    private List<Account> accounts;
    private long nextAccountNumber;
    private Random random;

    public AccountManager() {
        accounts = new ArrayList<>();
        nextAccountNumber = 1000;  // Starting account number
        random = new Random();
    }

    // Create new account with auto-generated IDs
    public void createAccount(String name, String email, String phone, String bankName) {
        long accountNumber = nextAccountNumber++;
        long accountId = 100000 + random.nextInt(900000);  // 6-digit random ID
        
        Account newAccount = new Account(name, email, phone, bankName, accountNumber, accountId);
        accounts.add(newAccount);
        
        System.out.println("\nAccount created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account ID: " + accountId);
    }

    // Find account by account number
    public Account findAccount(long accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }
}