package com.sbi.bankapp.bank;

public class BankAccount {
        public int id;
        public String branches[];

        public void displayBankAccountInfo() {
            System.out.println("Bank Account ID: " + id);
            System.out.print("Branches: ");
            for (String branch : branches) {
                System.out.print(branch + " ");
            }
        }
    }


