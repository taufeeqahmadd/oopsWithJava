//Question  — Online Banking System
//Scenario: An online banking application allows customers to withdraw money from their
//account. The system should prevent withdrawal when the requested amount is greater than
//the available balance.
//(a) Create a class BankAccount with accountNumber and balance attributes.
//(b) Create a method withdraw(double amount) that throws an exception if the withdrawal
//amount is greater than the balance.
//(c) Create a custom exception InsufficientBalanceException. 
//(d) Handle the e


// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance! \nAvailable balance: Rs. " + balance
            );
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: Rs. " + balance);
    }
}

// Main class
public class OnlineBankingSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456", 5000);

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
