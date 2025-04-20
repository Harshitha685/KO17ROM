package com.xworkz.methodoverriding.bank;

public class BankRunner {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.getBankName();
        bank.openAccount();
        bank.closeAccount();
        bank.getInterestRate();
        System.out.println();



        Bank bank1 = new CanaraBank();
        bank1.getBankName();
        bank1.openAccount();
        bank1.closeAccount();
        bank1.getInterestRate();
        System.out.println();


        CanaraBank cb = new CanaraBank();
        cb.getBankName();
        cb.openAccount();
        cb.closeAccount();
        cb.getInterestRate();

    }
}

