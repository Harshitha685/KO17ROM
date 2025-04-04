package com.sbi.bankapp;

import com.sbi.bankapp.bank.BankAccount;
import com.sbi.bankapp.customer.Customer;

public class BankAccountRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        String branches1[] = {"Koramangala", "Jayanagar", "BTM"};
        String branches2[] = {"HSR", "Indiranagar"};
        // Create BankAccount 1
        BankAccount acc1 = new BankAccount();
        acc1.id = 1001;
        acc1.branches = branches1;

        // Create BankAccount 2
        BankAccount acc2 = new BankAccount();
        acc2.id = 1002;
        acc2.branches = branches2;

        // Store bank accounts in array
        BankAccount accounts[] = {acc1, acc2};

        // Create customer and assign bank accounts
        Customer customer = new Customer();
        customer.customerName = "Harshitha";
        customer.bankAccounts = accounts;

        // Display all info
        customer.displayCustomerInfo();

        System.out.println("Main ended");
    }
}
