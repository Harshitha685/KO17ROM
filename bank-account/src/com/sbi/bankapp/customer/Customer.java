package com.sbi.bankapp.customer;

import com.sbi.bankapp.bank.BankAccount;

public class Customer {
        public String customerName;
        public BankAccount bankAccounts[];

        public void displayCustomerInfo() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Bank Accounts:");
            for (BankAccount account : bankAccounts) {
                account.displayBankAccountInfo() ;
            }
        }
    }


