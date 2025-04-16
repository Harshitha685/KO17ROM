package com.xworkz.tasks.account;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountType();;
        account.getAccountStatus();
        account.deposit();
        account.withdraw();
        account.checkBalance();

       Account account1 = new SavingsAccount();
        account1.getAccountStatus();
        account1.accountType();
       account1.withdraw();
        account1.deposit();
        account1.checkBalance();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.calculateInterest();
        savingsAccount.setInterestRate();
        savingsAccount.setSalaryAccount();
        savingsAccount.displayAccountType();
        savingsAccount.convertToJointAccount();


        Account account2 = new SavingsAccount();

        SavingsAccount savingsAccount1 = (SavingsAccount) account1;
        System.out.println(savingsAccount1);

    }
}
