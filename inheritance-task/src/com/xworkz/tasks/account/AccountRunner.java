package com.xworkz.tasks.account;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountType();;
        account.getAccountStatus();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.getAccountStatus();
        savingsAccount.accountType();
    }
}
