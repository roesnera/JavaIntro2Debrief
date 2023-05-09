package com.example.bankaccount;

public class BankAccount {
    /*
        RULES:
        1. No direct souts in our methods, only returns
        2. Do not allow for negative balances!

        Requirements:
            Instance fields(data type):
                balance(double)
                nameOnAccount(String)
                accountNumber(int)
                accountType(String)

            Class methods(return types):
                withdraw(boolean)
                deposit(boolean)
                constructor
                getters(field type)
                toString(String)
     */

    /*
        Instance field declarations should go here
        balance(double), nameOnAccount(String), accountNumber(int), accountType(String)
        These fields should not be able to be manipulated or access outside this class!
     */

    private double balance;
    private String nameOnAccount;
    private int accountNumber;
    private String accountType;

    /*
        Constructor method should go here
        remember to take proper input for each instance field
        then, assign that input to the appropriate field
     */

    public BankAccount(double balance, String nameOnAccount, int accountNumber, String accountType) {
        this.balance = balance;
        this.nameOnAccount = nameOnAccount;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
/*
        All your getter methods can go below
        The return type for your getter methods depends on which instance field you are getting!
     */

    public double getBalance() {
        return balance;
    }

    public String getNameOnAccount() {
        return nameOnAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    /*
            Here you should write your withdraw method
            requirements:
                1. no negatives as input
                2. depending on accountType:
                    calculate transaction fee of $1.50 (checking only)
                    calculate interest of 1% on withdrawn amount (savings only)
                3. check balance, do not allow for overdrafting
                4. update balance
                5. return true if successful
                    otherwise, return false
         */
    public boolean withdraw(double sum) {
        double checkingTotalChange = sum + 1.5;
        if (sum < 0
                || (
                this.accountType.equalsIgnoreCase("checking")
                        && checkingTotalChange > this.balance
        )
                || sum > this.balance) {
            return false;
        }

        if (this.accountType.equalsIgnoreCase("checking")) {
            this.balance -= checkingTotalChange;
            return true;
        }

        this.balance -= sum;
        return true;
    }

    /*
        Here you should write your deposit method
        requirements:
            1. no negatives as input
            3. update balance
            2. return true if successful
                otherwise, return false
     */

    public boolean deposit(double sum) {
        if (sum < 0) {
            return false;
        }
        this.balance += sum;
        return true;
    }

    /*
        Here you should write you toString method
        requirements:
            1. returns a String that represents all your instance field values
     */

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", nameOnAccount='" + nameOnAccount + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
