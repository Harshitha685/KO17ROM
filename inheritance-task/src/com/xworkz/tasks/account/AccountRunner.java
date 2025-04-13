package com.xworkz.tasks.account;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountType();;
        account.getAccountStatus();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.getAccountStatus();
        savingsAccount.accountType();


        Account account1 = new SavingsAccount();

        SavingsAccount savingsAccount1 = (SavingsAccount) account1;
        System.out.println(savingsAccount1);

    }
}
