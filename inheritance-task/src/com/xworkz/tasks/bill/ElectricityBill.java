package com.xworkz.tasks.bill;

public  class ElectricityBill extends Bill{

        public void setElectricityDetails() {
            System.out.println("bill info are :");
        }

        public void calculateAmount() {
            System.out.println("Amount calculated based on electricity usage.");
        }

        public void showElectricityBill() {
            System.out.println("Show bill");
        }

        public void checkHighUsage() {
                System.out.println("High usage alert! Consider saving energy.");
            }


        public void suggestSavingTips() {
            System.out.println(" Turn off lights when not in use.");
        }
    }


