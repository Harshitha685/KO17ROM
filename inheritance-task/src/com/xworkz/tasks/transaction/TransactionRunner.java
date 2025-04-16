package com.xworkz.tasks.transaction;

public class TransactionRunner {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.transactionType();
        transaction.transactionAmount();
        transaction.transactionDate();
        transaction.transactionStatus();
        transaction.transactionMode();

        System.out.println("--------------------------");

        Transaction transaction2 = new WithDrawal();
        transaction2.transactionType();
        transaction2.transactionAmount();
        transaction2.transactionDate();
        transaction2.transactionStatus();
        transaction2.transactionMode();

        System.out.println("--------------------------");

        WithDrawal withdrawal = new WithDrawal();
        withdrawal.withdrawalAmount();
        withdrawal.withdrawalFee();
        withdrawal.isOverLimit();
        withdrawal.withdrawalAccount();
        withdrawal.withdrawalStatus();

        System.out.println("--------------------------");

        Transaction transaction3 = new WithDrawal();
        WithDrawal withdrawal2 = (WithDrawal) transaction3;
        System.out.println(withdrawal2);
    }
}
