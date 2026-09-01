// Question 4 — Bank Account Transactions

// Scenario: A bank account is accessed by multiple threads. One thread deposits money while
// another thread withdraws money. The account balance must remain consistent.
// (a) Create a class BankAccount with a balance variable. 
// (b) Create deposit() and withdraw() methods. 
// (c) Use the synchronized keyword to prevent race conditions. 
// (d) Create two threads to perform deposit and withdrawal operations simultaneously. 

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized method for depositing money
    public synchronized void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs. " + amount);
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Synchronized method for withdrawing money
    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. " + amount);
            System.out.println("Current Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Display final balance
    public void displayBalance() {
        System.out.println("Final Balance: Rs. " + balance);
    }
}

// Deposit thread
class DepositThread extends Thread {
    private BankAccount account;

    public DepositThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(2000);
    }
}

// Withdrawal thread
class WithdrawThread extends Thread {
    private BankAccount account;

    public WithdrawThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(1000);
    }
}

// Main class
public class BankAccountTransactions {
    public static void main(String[] args) {

        // Initial balance
        BankAccount account = new BankAccount(5000);

        // Create deposit and withdrawal threads
        DepositThread depositThread = new DepositThread(account);
        WithdrawThread withdrawThread = new WithdrawThread(account);

        // Start both threads simultaneously
        depositThread.start();
        withdrawThread.start();

        // Wait for both threads to finish
        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final balance
        account.displayBalance();
    }
}
