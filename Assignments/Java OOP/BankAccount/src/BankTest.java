public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount A1 = new BankAccount();
        BankAccount A2 = new BankAccount();
        BankAccount A3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        A1.deposit(1000 , "saving");
        A2.deposit(2000,"saving");
        A3.deposit(3000,"saving");
        // - each deposit should increase the amount of totalMoney
        A1.deposit(1000,"saving");
        A2.deposit(1000,"saving");
        A3.deposit(1000,"saving");
        // Withdrawal Test
        A1.withdraw(500,"saving");
        A2.withdraw(500,"saving");
        A3.withdraw(500,"saving");
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance

        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)

        System.out.println(A1.getSavingsBalance());
        System.out.println(A2.getSavingsBalance());
        System.out.println(A3.getSavingsBalance());


}
}
