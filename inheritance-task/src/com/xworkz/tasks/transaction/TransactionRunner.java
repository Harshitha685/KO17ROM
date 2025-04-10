package com.xworkz.tasks.transaction;

public class TransactionRunner {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.processTransaction();
        transaction.isTransactionSuccessful();

        WithDrawl withDrawl = new WithDrawl();
        withDrawl.processTransaction();
        withDrawl.isTransactionSuccessful();
    }
}
