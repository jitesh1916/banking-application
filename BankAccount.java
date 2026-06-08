public class BankAccount {


    // Stores current account balance
    private double balance;

    // Initializes account with zero balance
    public BankAccount() {
        this.balance = 0;
    }

    // Deposits amount if it is positive
    public boolean deposit(double amount) {

        if(amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    // Withdraws amount if balance is sufficient
    public boolean withdraw(double amount) {

        if(amount <= 0) {
            return false;
        }

        if(balance < amount) {
            return false;
        }

        balance -= amount;
        return true;
    }

    // Returns current account balance
    public double getBalance() {
        return balance;
    }
}