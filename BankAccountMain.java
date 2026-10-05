class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance > 0 ? initialBalance : 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Validation Error: Deposit amount must be positive.");
        } else {
            this.balance += amount;
            System.out.println("Successfully deposited $" + amount + ". New Balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-55201", 500.00);

        acc.deposit(-50.0);
        acc.deposit(250.00);
    }
}