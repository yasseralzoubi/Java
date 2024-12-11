import java.util.Objects;

public class BankAccount {

    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; //

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        accounts += 1;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String accountType) {
        if (Objects.equals(accountType, "saving")) {
            this.savingsBalance += amount;
        } else {
            this.checkingBalance += amount;
        }
    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void withdraw(double amount, String accountType) {
        if (amount > this.savingsBalance) {
            System.out.println("insufficient balance");
        }
        if (Objects.equals(accountType, "saving")) {
            this.savingsBalance -= amount;
        } else {
            this.checkingBalance -= amount;
        }
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void displayBalance() {
        System.out.println("Saving Balance : $" + this.savingsBalance);
        System.out.println("Checking Balance : $" + this.checkingBalance);

    }

}