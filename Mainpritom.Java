public class BankAccount {
    private double balance;

    // Constructor to set initial balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // One method for both deposit and withdrawal
    public void transaction(double amount) {
        // Deposit
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Overloaded method for withdrawal with security code
    public void transaction(double amount, int securityCode) {
        if (securityCode != 123) {
            System.out.println("Invalid security code! Withdrawal failed.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }

    // Display balance
    public void showBalance() {
        System.out.println("Final Balance: " + balance);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000); // Initial balance

        acc.transaction(500);          // Deposit 500
        acc.transaction(300, 123);     // Withdraw 300 with correct code
        acc.transaction(800, 111);     // Wrong code
        acc.transaction(2000, 123);    // Insufficient balance
        acc.showBalance();             // Show final balance
    }
}
