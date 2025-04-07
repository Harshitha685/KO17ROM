package com.xworkz.simcardapp;

import com.xworkz.simcardapp.simcard.SimCard;

public class SimCardRunner {

        public static void main(String[] args) {
            SimCard ref1 = new SimCard();
            ref1.setProvider("Jio");
            ref1.setSimType("Nano");
            ref1.setNumber(9876543210L);
            ref1.setBalance(50.25);
            ref1.setIsActive(true);
            ref1.setNetworkType("4G");
            ref1.setIssuedState("Karnataka");

            String provider1 = ref1.getProvider();
            String simType1 = ref1.getSimType();
            long number1 = ref1.getNumber();
            double balance1 = ref1.getBalance();
            boolean active1 = ref1.getIsActive();
            String network1 = ref1.getNetworkType();
            String state1 = ref1.getIssuedState();

            System.out.println("Sim Provider       : " + provider1);
            System.out.println("Sim Type           : " + simType1);
            System.out.println("Phone Number       : " + number1);
            System.out.println("Balance            : ₹" + balance1);
            System.out.println("Active             : " + active1);
            System.out.println("Network Type       : " + network1);
            System.out.println("Issued State       : " + state1);
            System.out.println();

            SimCard ref2 = new SimCard();
            ref2.setProvider("Airtel");
            ref2.setSimType("Micro");
            ref2.setNumber(9123456789L);
            ref2.setBalance(120.75);
            ref2.setIsActive(false);
            ref2.setNetworkType("5G");
            ref2.setIssuedState("Maharashtra");

            String provider2 = ref2.getProvider();
            String simType2 = ref2.getSimType();
            long number2 = ref2.getNumber();
            double balance2 = ref2.getBalance();
            boolean active2 = ref2.getIsActive();
            String network2 = ref2.getNetworkType();
            String state2 = ref2.getIssuedState();

            System.out.println("Sim Provider       : " + provider2);
            System.out.println("Sim Type           : " + simType2);
            System.out.println("Phone Number       : " + number2);
            System.out.println("Balance            : ₹" + balance2);
            System.out.println("Active             : " + active2);
            System.out.println("Network Type       : " + network2);
            System.out.println("Issued State       : " + state2);
            System.out.println();

            SimCard ref3 = new SimCard();
            ref3.setProvider("Vi");
            ref3.setSimType("Nano");
            ref3.setNumber(9988776655L);
            ref3.setBalance(10.00);
            ref3.setIsActive(true);
            ref3.setNetworkType("4G");
            ref3.setIssuedState("Tamil Nadu");

            String provider3 = ref3.getProvider();
            String simType3 = ref3.getSimType();
            long number3 = ref3.getNumber();
            double balance3 = ref3.getBalance();
            boolean active3 = ref3.getIsActive();
            String network3 = ref3.getNetworkType();
            String state3 = ref3.getIssuedState();

            System.out.println("Sim Provider       : " + provider3);
            System.out.println("Sim Type           : " + simType3);
            System.out.println("Phone Number       : " + number3);
            System.out.println("Balance            : ₹" + balance3);
            System.out.println("Active             : " + active3);
            System.out.println("Network Type       : " + network3);
            System.out.println("Issued State       : " + state3);
            System.out.println();

            SimCard ref4 = new SimCard();
            ref4.setProvider("BSNL");
            ref4.setSimType("Standard");
            ref4.setNumber(9090909090L);
            ref4.setBalance(75.00);
            ref4.setIsActive(true);
            ref4.setNetworkType("3G");
            ref4.setIssuedState("Kerala");

            String provider4 = ref4.getProvider();
            String simType4 = ref4.getSimType();
            long number4 = ref4.getNumber();
            double balance4 = ref4.getBalance();
            boolean active4 = ref4.getIsActive();
            String network4 = ref4.getNetworkType();
            String state4 = ref4.getIssuedState();

            System.out.println("Sim Provider       : " + provider4);
            System.out.println("Sim Type           : " + simType4);
            System.out.println("Phone Number       : " + number4);
            System.out.println("Balance            : ₹" + balance4);
            System.out.println("Active             : " + active4);
            System.out.println("Network Type       : " + network4);
            System.out.println("Issued State       : " + state4);
            System.out.println();

            SimCard ref5 = new SimCard();
            ref5.setProvider("Jio");
            ref5.setSimType("eSIM");
            ref5.setNumber(9012345678L);
            ref5.setBalance(200.00);
            ref5.setIsActive(true);
            ref5.setNetworkType("5G");
            ref5.setIssuedState("Telangana");

            String provider5 = ref5.getProvider();
            String simType5 = ref5.getSimType();
            long number5 = ref5.getNumber();
            double balance5 = ref5.getBalance();
            boolean active5 = ref5.getIsActive();
            String network5 = ref5.getNetworkType();
            String state5 = ref5.getIssuedState();

            System.out.println("Sim Provider       : " + provider5);
            System.out.println("Sim Type           : " + simType5);
            System.out.println("Phone Number       : " + number5);
            System.out.println("Balance            : ₹" + balance5);
            System.out.println("Active             : " + active5);
            System.out.println("Network Type       : " + network5);
            System.out.println("Issued State       : " + state5);
            System.out.println();

        }
    }




