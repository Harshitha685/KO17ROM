package com.xworkz.methodoverriding.bank;

public class CanaraBank extends Bank{

        @Override
        public void getBankName() {
            System.out.println("Bank: Canara Bank");
        }

        @Override
        public void openAccount() {
            System.out.println("Opening account in Canara Bank with zero balance.");
        }

        @Override
        public void closeAccount() {
            System.out.println("Closing account in Canara Bank after verification.");
        }

        @Override
        public void getInterestRate() {
            System.out.println("Interest Rate: 6.5% (Canara Bank)");
        }


}
