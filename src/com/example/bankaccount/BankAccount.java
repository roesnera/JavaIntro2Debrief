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
    public BankAccount(double totalBalance, String accountName, int numOfAccount, String typeOfAccount) {
        this.balance = totalBalance;
        this.nameOnAccount = accountName;
        this.accountNumber = numOfAccount;
        this.accountType = typeOfAccount;
    }


    /*
        All your getter methods can go below
        The return type for your getter methods depends on which instance field you are getting!
     */
    public double getBalance() {
        return this.balance;
    }

    public String getNameOnAccount() {
        return this.nameOnAccount;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }




    /*
        Here you should write your withdraw method
        requirements:
            1. no negatives as input
            2. depending on accountType:
                calculate transaction fee of $1.50 (checking only)
            3. check balance, do not allow for overdrafting
            4. update balance
            5. return true if successful
                otherwise, return false
     */

    public boolean withdraw(double amountToWithdraw) {
            if(amountToWithdraw < 0.00) {
                return false;
            }

            if (accountType == "Checking") {
                if(amountToWithdraw + 1.50 > balance) {
                    return false;
                }
                balance -= amountToWithdraw + 1.50;
                return true;
            }
                double interest = amountToWithdraw * 0.01;
                if(amountToWithdraw + interest > balance) {
                    return false;
                }
                balance -= amountToWithdraw + interest;
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
    public boolean deposit(double amountToDeposit) {
        if(amountToDeposit > 0) {
            balance += amountToDeposit;
            return true;
        }
        return false;
    }

    /*
        Here you should write you toString method
        requirements:
            1. returns a String that represents all your instance field values
     */
    @Override
    public String toString() {
        return "Your balance is: " + balance + "\n" +
                "Your name on the account is: " + nameOnAccount + "\n" +
                "Your account number is: " + accountNumber + "\n" +
                "The Type of the account is : " + accountType + ".";
    }
}



