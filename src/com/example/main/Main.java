package com.example.main;

// import statement for our BankAccount class
import com.example.bankaccount.BankAccount;

public class Main {

    public void go() {
    /*
        Your main method here should create two instances of BankAccount
            one as a savings type
            one as a checkings type

        Call each method of each object instance to verify that they work as intended

        If you have extra time, check for invalid input as well (negative numbers, overdrafts, etc.)
            we do this to ensure that our class handles input as expected
            this means that it also has to handle invalid input appropriately
     */
         BankAccount CheckingAccount = new BankAccount(500, "George Doe", 317899, "Checking");

        System.out.println("Withdraw amount $100 from checking account: " + CheckingAccount.withdraw(100));
        System.out.println(CheckingAccount);

        System.out.println("Deposit amount $50 to checking account: " + CheckingAccount.deposit(50));
        System.out.println(CheckingAccount);

        System.out.println("Withdraw amount $550 from checking account: " + CheckingAccount.withdraw(550));
        System.out.println(CheckingAccount);

        System.out.println("Withdraw amount $440 from checking account: " + CheckingAccount.withdraw(440));
        System.out.println(CheckingAccount);


        BankAccount SavingAccount = new BankAccount(1500, "Erick", 758733, "Saving");

        System.out.println("Withdraw amount $500 from savings account: " + SavingAccount.withdraw(500));
        System.out.println(SavingAccount);

        System.out.println("Deposit amount $100 to savings account: " + SavingAccount.deposit(100));
        System.out.println(SavingAccount);

        System.out.println("Withdraw amount $1100 from savings account: " + SavingAccount.withdraw(1100));
        System.out.println(SavingAccount);

        System.out.println("Withdraw amount $900 from savings account: " + SavingAccount.withdraw(900));
        System.out.println(SavingAccount);


}
    public static void main(String[] args) {
        new Main().go();
    }
}
